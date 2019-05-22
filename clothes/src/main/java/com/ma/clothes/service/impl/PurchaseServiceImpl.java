package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.common.status.DepotStatus;
import com.ma.clothes.common.status.PurchaseStatus;
import com.ma.clothes.common.tools.MyException;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.dao.*;
import com.ma.clothes.pojo.ao.PurchaseAO;
import com.ma.clothes.pojo.dto.GoodsDTO;
import com.ma.clothes.pojo.entity.*;
import com.ma.clothes.service.IPurchaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-13
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase>
        implements IPurchaseService, PurchaseStatus {

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Autowired
    private DepotInfoMapper depotInfoMapper;

    @Autowired
    private DepotMapper depotMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private DepotGoodsMapper depotGoodsMapper;

    @Autowired
    private FinanceMapper financeMapper;


    @Override
    public IPage<Purchase> getList(PurchaseAO purchaseAO) {
        Page<Purchase> page = new Page<>();
        page.setCurrent(purchaseAO.getPage());
        page.setSize(purchaseAO.getRows());

        QueryWrapper<Purchase> queryWrapper = new QueryWrapper<>();
        //判断编号是否有值
        if (purchaseAO.getNum() != null && purchaseAO.getNum() != 0) {
            queryWrapper.eq("num", purchaseAO.getNum());
        }
        //判断商品信息是否有值
        if (purchaseAO.getGoodsInfo() != null && !"".equals(purchaseAO.getGoodsInfo())) {
            queryWrapper.like("goods_info", purchaseAO.getGoodsInfo());
        }
        //判断时间是否有值
        if (purchaseAO.getBeginTime() != null && !"".equals(purchaseAO.getBeginTime())
                && purchaseAO.getEndTime() != null && !"".equals(purchaseAO.getEndTime())) {
            queryWrapper.ge("operate_time", purchaseAO.getBeginTime());
            queryWrapper.le("operate_time", purchaseAO.getEndTime());
        } else if (purchaseAO.getBeginTime() != null && !"".equals(purchaseAO.getBeginTime())) {
            queryWrapper.ge("operate_time", purchaseAO.getBeginTime());
        } else if (purchaseAO.getEndTime() != null && !"".equals(purchaseAO.getEndTime())) {
            queryWrapper.le("operate_time", purchaseAO.getEndTime());
        }

        IPage<Purchase> iPage = purchaseMapper.selectPage(page, queryWrapper);

        return iPage;
    }

    @Override
    @Transactional
    public int depotPurchase(String id, String operator) throws MyException {
        //1.更新采购订单信息
        Purchase purchase = purchaseMapper.selectById(id);
        purchase.setOperator(purchase.getOperator() + "," + operator);
        purchase.setStatus((byte) 2);
        purchaseMapper.updateById(purchase);

        //2.分析商品信息
        String[] split = purchase.getGoodsInfo().split(";");
        int sum = 0;
        List<GoodsDTO> list = new ArrayList<>();
        for (String s : split) {
            GoodsDTO goodsDTO = new GoodsDTO();
            String[] goods = s.split(":");
            goodsDTO.setNum(Integer.valueOf(goods[0]));
            goodsDTO.setGoods(goods[1]);
            goodsDTO.setCount(Integer.valueOf(goods[2]));
            sum = sum + Integer.valueOf(goods[2]);
            goodsDTO.setUnit(goods[4]);
            list.add(goodsDTO);
        }

        //3.增加采购入库信息
        DepotInfo depotInfo = new DepotInfo();
        depotInfo.setId(StringUtils.getUUID());
        //3.1获取新document值
        QueryWrapper<DepotInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("document", "select max(document) from depot_info");
        DepotInfo one = depotInfoMapper.selectOne(queryWrapper);
        depotInfo.setDocument(one.getDocument() + 1);

        depotInfo.setCustomer(purchase.getSupplier());
        depotInfo.setGoodsInfo(purchase.getGoodsInfo());
        depotInfo.setOperator(operator);
        depotInfo.setAmount(purchase.getAmount());
        depotInfo.setInOrOut(true);
        depotInfo.setRemark(purchase.getRemark());
        depotInfo.setSum(sum);

        //4.保存入库信息
        depotInfoMapper.insert(depotInfo);

        //5.处理商品入库
        for (GoodsDTO goodsDTO : list) {
            //5.1获取仓库信息
            QueryWrapper<Depot> depotQueryWrapper = new QueryWrapper<>();
            depotQueryWrapper.eq("num", goodsDTO.getNum());
            Depot depot = depotMapper.selectOne(depotQueryWrapper);
            //5.2判断仓库是否放得下,如果放得下，更新仓库库存数量
            if (depot.getCapacity() < depot.getCurrCount() + goodsDTO.getCount()) {
                throw new MyException(depot.getNum() + "号仓库放不下了");
            } else {
                depot.setCurrCount(depot.getCurrCount() + goodsDTO.getCount());
                depotMapper.updateById(depot);
            }
            //5.3查询商品信息
            QueryWrapper<Goods> goodsQueryWrapper = new QueryWrapper<>();
            goodsQueryWrapper.eq("name", goodsDTO.getGoods());
            Goods goods = goodsMapper.selectOne(goodsQueryWrapper);

            //5.4判断库存中是否有货
            QueryWrapper<DepotGoods> depotGoodsQueryWrapper = new QueryWrapper<>();
            depotGoodsQueryWrapper.eq("depot_num", goodsDTO.getNum());
            depotGoodsQueryWrapper.eq("goods_name", goodsDTO.getGoods());
            DepotGoods depotGoods = depotGoodsMapper.selectOne(depotGoodsQueryWrapper);
            //5.5有库存信息就更新，没有就插入
            if (depotGoods != null) {
                depotGoods.setCount(depotGoods.getCount() + goodsDTO.getCount());
                depotGoods.setRemark(purchase.getRemark());
                depotGoodsMapper.updateById(depotGoods);
            } else {
                depotGoods = new DepotGoods();
                depotGoods.setId(StringUtils.getUUID());
                depotGoods.setDepotId(depot.getId());
                depotGoods.setDepotNum(depot.getNum());
                depotGoods.setGoodsId(goods.getId());
                depotGoods.setGoodsName(goods.getName());
                depotGoods.setGoodsNum(goods.getNumber());
                depotGoods.setUnit(goods.getUnit());
                depotGoods.setCount(goodsDTO.getCount());
                depotGoods.setRemark(purchase.getRemark());
                depotGoodsMapper.insert(depotGoods);
            }
        }
        //6.更新财务
        Finance finance = new Finance();
        finance.setId(StringUtils.getUUID());
        finance.setProperties("采购订货");
        finance.setOrderId(purchase.getNum().toString());
        finance.setInOrOut(false);
        finance.setAmount(purchase.getAmount());
        financeMapper.insert(finance);
        return 0;
    }

    @Override
    public void uncheck(String id) {
        Purchase purchase = purchaseMapper.selectById(id);
        String operator = purchase.getOperator();
        String[] split = operator.split(",");
        purchase.setOperator(split[0]);
        purchase.setStatus((byte)0);
        purchaseMapper.updateById(purchase);
    }

    @Override
    @Transactional
    public int outPurchase(String id, String operator) throws MyException {
        DepotInfo depotInfo1 = depotInfoMapper.selectById(id);
        //列出商品信息
        String[] split = depotInfo1.getGoodsInfo().split(";");
        for (String s : split) {
            String[] goods = s.split(":");
            //4.获取库存信息
            QueryWrapper<DepotGoods> depotGoodsQueryWrapper = new QueryWrapper<>();
            depotGoodsQueryWrapper.eq("depot_num", goods[0]);
            depotGoodsQueryWrapper.eq("goods_name", goods[1]);
            DepotGoods depotGoods = depotGoodsMapper.selectOne(depotGoodsQueryWrapper);
            //5.库存数量是否和退货数量相等
            if (depotGoods.getCount().equals(Integer.valueOf(goods[2]))) {
                depotGoodsMapper.deleteById(depotGoods.getId());
            } else if (depotGoods.getCount() > Integer.valueOf(goods[2])) {
                depotGoods.setCount(depotGoods.getCount() - Integer.valueOf(goods[2]));
                depotGoodsMapper.updateById(depotGoods);
            } else {
                throw new MyException(depotGoods.getGoodsName() + "已经卖出，无法退货");
            }
            //6.仓库库存增加
            QueryWrapper<Depot> depotQueryWrapper = new QueryWrapper<>();
            depotQueryWrapper.eq("num", Integer.valueOf(goods[0]));
            Depot depot = depotMapper.selectOne(depotQueryWrapper);
            depot.setCurrCount(depot.getCurrCount() + Integer.valueOf(goods[2]));
            depotMapper.updateById(depot);
        }
        //将入库信息变为退货
        depotInfo1.setInOrOut(false);
        depotInfo1.setOperator(depotInfo1.getOperator() + "," + operator);
        depotInfoMapper.updateById(depotInfo1);

        //更新财务表
        Finance finance = new Finance();
        finance.setId(StringUtils.getUUID());
        finance.setProperties("采购退货");
        finance.setOrderId(depotInfo1.getDocument().toString());
        finance.setInOrOut(true);
        finance.setAmount(depotInfo1.getAmount());
        financeMapper.insert(finance);
        return 0;
    }
}
