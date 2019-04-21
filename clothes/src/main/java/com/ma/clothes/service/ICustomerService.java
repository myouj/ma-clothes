package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.pojo.ao.CustomerAO;
import com.ma.clothes.pojo.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-21
 */
public interface ICustomerService extends IService<Customer> {

    IPage<Customer> getCustomerList(CustomerAO customerAO);

}
