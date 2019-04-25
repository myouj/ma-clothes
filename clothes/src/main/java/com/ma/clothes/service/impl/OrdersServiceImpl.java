package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.dao.DepotGoodsMapper;
import com.ma.clothes.dao.DepotMapper;
import com.ma.clothes.dao.FinanceMapper;
import com.ma.clothes.pojo.ao.OrdersAO;
import com.ma.clothes.pojo.entity.Depot;
import com.ma.clothes.pojo.entity.DepotGoods;
import com.ma.clothes.pojo.entity.Finance;
import com.ma.clothes.pojo.entity.Orders;
import com.ma.clothes.dao.OrdersMapper;
import com.ma.clothes.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-23
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {


    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private DepotGoodsMapper depotGoodsMapper;

    @Autowired
    private DepotMapper depotMapper;

    @Autowired
    private FinanceMapper financeMapper;

    @Override
    public IPage<Orders> getList(OrdersAO ordersAO) {
        Page<Orders> page = new Page<>();
        page.setCurrent(ordersAO.getPage());
        page.setSize(ordersAO.getRows());

        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        //判断客户是否有值
        if (ordersAO.getCustomer() != null && !"".equals(ordersAO.getCustomer())) {
            queryWrapper.like("customer", ordersAO.getCustomer());
        }
        //判断商品信息是否有值
        if (ordersAO.getGoodsInfo() != null && !"".equals(ordersAO.getGoodsInfo())) {
            queryWrapper.like("goods_info", ordersAO.getGoodsInfo());
        }
        //判断时间是否有值
        if (ordersAO.getBeginTime() != null && !"".equals(ordersAO.getBeginTime())
                && ordersAO.getEndTime() != null && !"".equals(ordersAO.getEndTime())) {
            queryWrapper.ge("operate_time", ordersAO.getBeginTime());
            queryWrapper.le("operate_time", ordersAO.getEndTime());
        } else if (ordersAO.getBeginTime() != null && !"".equals(ordersAO.getBeginTime())) {
            queryWrapper.ge("operate_time", ordersAO.getBeginTime());
        } else if (ordersAO.getEndTime() != null && !"".equals(ordersAO.getEndTime())) {
            queryWrapper.le("operate_time", ordersAO.getEndTime());
        }

        queryWrapper.ne("status", "3");

        IPage<Orders> iPage = ordersMapper.selectPage(page, queryWrapper);

        return iPage;
    }

    @Override
    @Transactional
    public void out(String id, String operator) {
        //获取订单信息
        Orders orders = ordersMapper.selectById(id);
        //将订单设置为出库状态,更新订单
        orders.setStatus((byte)2);
        orders.setOperator(orders.getOperator() + "," + operator);
        ordersMapper.updateById(orders);
        //解析商品
        String[] s = orders.getGoodsInfo().split(";");
        for(String g : s){
            String[] goods = g.split(":");
            //查询库存
            QueryWrapper<DepotGoods> depotGoodsQueryWrapper = new QueryWrapper<>();
            depotGoodsQueryWrapper.eq("depot_num", goods[0]);
            depotGoodsQueryWrapper.eq("goods_name", goods[1]);
            DepotGoods depotGoods = depotGoodsMapper.selectOne(depotGoodsQueryWrapper);

            //判断该商品出库后，还有没有库存存在
            //无库存删除信息，有库存更新信息
            if(depotGoods.getCount() > Integer.valueOf(goods[2])){
                depotGoods.setCount(depotGoods.getCount() - Integer.valueOf(goods[2]));
                depotGoodsMapper.updateById(depotGoods);
            }else{
                depotGoodsMapper.deleteById(depotGoods.getId());
            }

            //更新仓库容量
            QueryWrapper<Depot> depotQueryWrapper = new QueryWrapper<>();
            depotQueryWrapper.eq("num", goods[0]);
            Depot depot = depotMapper.selectOne(depotQueryWrapper);
            depot.setCurrCount(depot.getCurrCount() - Integer.valueOf(goods[2]));
            depotMapper.updateById(depot);

            //增加财务信息
            Finance finance = new Finance();
            finance.setId(StringUtils.getUUID());
            finance.setProperties("订货出库");
            finance.setOrderId(orders.getId());
            finance.setInOrOut(true);
            finance.setAmount(orders.getAmount());
            financeMapper.insert(finance);

        }


    }
}
