package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ma.clothes.pojo.ao.OrdersAO;
import com.ma.clothes.pojo.entity.Orders;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-23
 */
public interface IOrdersService extends IService<Orders> {

    IPage<Orders> getList(OrdersAO ordersAO, Boolean in);

    void out(String id, String operator);

    void checkReturn(String id, String operator);

}
