package com.ma.clothes.service.impl;

import com.ma.clothes.pojo.entity.Orders;
import com.ma.clothes.dao.OrdersMapper;
import com.ma.clothes.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
