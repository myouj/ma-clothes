package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.common.status.DepotStatus;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.dao.AllocationInfoMapper;
import com.ma.clothes.dao.DepotMapper;
import com.ma.clothes.dao.GoodsMapper;
import com.ma.clothes.pojo.ao.DepotGoodsAO;
import com.ma.clothes.pojo.entity.AllocationInfo;
import com.ma.clothes.pojo.entity.Depot;
import com.ma.clothes.pojo.entity.DepotGoods;
import com.ma.clothes.dao.DepotGoodsMapper;
import com.ma.clothes.pojo.entity.Goods;
import com.ma.clothes.service.IDepotGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ma.clothes.service.IDepotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-02
 */
@Service
public class DepotGoodsServiceImpl extends ServiceImpl<DepotGoodsMapper, DepotGoods> implements IDepotGoodsService, DepotStatus {

    @Autowired
    private DepotGoodsMapper depotGoodsMapper;

    @Autowired
    private DepotMapper depotMapper;

    @Autowired
    private AllocationInfoMapper allocationInfoMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public IPage<DepotGoods> getDepotGoodsList(DepotGoodsAO depotGoodsAO) {
        Page<DepotGoods> depotGoodsPage = new Page<>();
        depotGoodsPage.setCurrent(depotGoodsAO.getPage());
        depotGoodsPage.setSize(depotGoodsAO.getRows());

        QueryWrapper<DepotGoods> depotGoodsQueryWrapper = new QueryWrapper<>();

        if(depotGoodsAO.getDepotNum() != null && depotGoodsAO.getDepotNum() != 0){
            depotGoodsQueryWrapper.eq("depot_num", depotGoodsAO.getDepotNum());
        }
        if(depotGoodsAO.getGoodsNum() != null && depotGoodsAO.getGoodsNum() != 0){
            depotGoodsQueryWrapper.eq("goods_num", depotGoodsAO.getGoodsNum());
        }

        if(depotGoodsAO.getGoodsName() != null && depotGoodsAO.getGoodsName() != ""){
            depotGoodsQueryWrapper.eq("goods_name", depotGoodsAO.getGoodsName());
        }

        IPage<DepotGoods> depotGoodsIPage = depotGoodsMapper.selectPage(depotGoodsPage, depotGoodsQueryWrapper);
        return depotGoodsIPage;
    }

    @Override
    public List<DepotGoods> getDepotGoodsByDnumber(String dnumber) {
        QueryWrapper<DepotGoods> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("depot_num", dnumber);

        return depotGoodsMapper.selectList(queryWrapper);
    }

    @Override
    public DepotGoods getDepotByDnumAndGoods(Integer dnum, String goods) {
        QueryWrapper<DepotGoods> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("depot_num", dnum);
        queryWrapper.eq("goods_name", goods);
        DepotGoods depotGoods = depotGoodsMapper.selectOne(queryWrapper);
        return depotGoods;
    }

    @Override
    @Transactional
    public Integer save(AllocationInfo allocationInfo, List<DepotGoods> list) {

        Integer currDepotNum = allocationInfo.getCurrDepot();
        Integer toDepotNum = allocationInfo.getToDepot();
        //获取目标仓库信息
        QueryWrapper<Depot> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("num", toDepotNum);
        Depot toDepot = depotMapper.selectOne(queryWrapper);
        //获取当前仓库信息
        QueryWrapper<Depot> queryWrapper1 = new QueryWrapper<>();
        queryWrapper1.eq("num", currDepotNum);
        Depot currDepot = depotMapper.selectOne(queryWrapper1);

        //目标仓库容量溢出
        if(allocationInfo.getAmount() + toDepot.getCurrCount() > toDepot.getCapacity()){
            return DEPOT_CAPACITY_OUT;
        }

        for(DepotGoods depotGoods : list){
            //获取商品信息
            QueryWrapper<Goods> goodsQueryWrapper = new QueryWrapper<>();
            goodsQueryWrapper.eq("name", depotGoods.getGoodsName());
            Goods goods = goodsMapper.selectOne(goodsQueryWrapper);
            //1.currDepotNum 和 depotGoods.getDepotNum()两个参数查询depot-goods信息，
            QueryWrapper<DepotGoods> currq = new QueryWrapper<>();
            currq.eq("depot_num", currDepotNum);
            currq.eq("goods_name", depotGoods.getGoodsName());
            DepotGoods curr = depotGoodsMapper.selectOne(currq);
            //更新商品库存数量，如果减少后为0，直接删除信息
            if(curr.getCount() - depotGoods.getCount() > 0){
                curr.setCount(curr.getCount() - depotGoods.getCount());
                depotGoodsMapper.updateById(curr);
            }else{
                depotGoodsMapper.deleteById(curr.getId());
            }

            //2.toDepotNum 和 depotGoods.getDepotNum()两个参数查询depot-goods信息，
            QueryWrapper<DepotGoods> toq = new QueryWrapper<>();
            toq.eq("depot_num", toDepotNum);
            toq.eq("goods_name", depotGoods.getGoodsName());
            DepotGoods to = depotGoodsMapper.selectOne(toq);
            //如果不存在，直接插入一条数据，如果存在，更新商品库存数量
            if(to == null){
                to = new DepotGoods();
                to.setId(StringUtils.getUUID());
                to.setDepotId(toDepot.getId());
                to.setDepotNum(toDepotNum);
                to.setGoodsId(goods.getId());
                to.setGoodsName(depotGoods.getGoodsName());
                to.setGoodsNum(goods.getNumber());
                to.setCount(depotGoods.getCount());
                to.setUnit(depotGoods.getUnit());
                depotGoodsMapper.insert(to);
            }else{
                to.setCount(to.getCount() + depotGoods.getCount());
                depotGoodsMapper.updateById(to);
            }
        }

        //3.减少currDepotNum 仓库的当前数量
        currDepot.setCurrCount(currDepot.getCurrCount() - allocationInfo.getAmount());
        depotMapper.updateById(currDepot);

        //4.增加toDepotNum 仓库的当前数量
        toDepot.setCurrCount(toDepot.getCurrCount() + allocationInfo.getAmount());
        depotMapper.updateById(toDepot);


        //5.插入一条allocationInfo数据
        allocationInfo.setId(StringUtils.getUUID());
        allocationInfoMapper.insert(allocationInfo);
        return DEPOT_CAN_IN;
    }
}
