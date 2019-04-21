package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.CustomerAO;
import com.ma.clothes.pojo.entity.Customer;
import com.ma.clothes.dao.CustomerMapper;
import com.ma.clothes.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-21
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public IPage<Customer> getCustomerList(CustomerAO customerAO) {
        Page<Customer> customerPage = new Page<>();

        customerPage.setCurrent(customerAO.getPage());
        customerPage.setSize(customerAO.getRows());

        QueryWrapper<Customer> queryWrapper = new QueryWrapper<>();
        if(customerAO.getCompany() != null && !"".equals(customerAO.getCompany())){
            queryWrapper.like("customer", customerAO.getCompany());
        }

        if(customerAO.getManager() != null && !"".equals(customerAO.getManager())){
            queryWrapper.like("manager", customerAO.getManager());
        }

        IPage<Customer> customerIPage = customerMapper.selectPage(customerPage, queryWrapper);

        return customerIPage;
    }
}
