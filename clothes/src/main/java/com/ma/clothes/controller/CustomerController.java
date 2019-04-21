package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.ao.CustomerAO;
import com.ma.clothes.pojo.entity.Customer;
import com.ma.clothes.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-04-21
 */
@RestController
@RequestMapping("//customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/getNewNum")
    public ResultUtil getNewNum() {
        QueryWrapper<Customer> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("number", "select max(number) from customer");
        Customer one = customerService.getOne(queryWrapper);
        return ResultUtil.result(200, one.getNumber() + 1);
    }

    @PostMapping("/upset")
    public ResultUtil upset(Customer customer) {
        try {
            if (customer.getId() != null && !"".equals(customer.getId())) {
                customerService.updateById(customer);
                return ResultUtil.result(200, 2);
            } else {
                customer.setId(StringUtils.getUUID());
                customerService.save(customer);
                return ResultUtil.result(200, 3);
            }
        }catch (Exception e){
            return ResultUtil.result(500);
        }
    }

    @GetMapping("/getCustomerList")
    public EasyUIUtil getCustomerList(CustomerAO customerAO){

        IPage<Customer> depotList = customerService.getCustomerList(customerAO);

        int total = (int)depotList.getTotal();
        int start = (int)depotList.getCurrent();
        int pageSize = (int)depotList.getPages();
        List<Customer> list = depotList.getRecords();

        return EasyUIUtil.result(start, pageSize, total, list);
    }

    @GetMapping("/getById")
    public ResultUtil getById(@RequestParam("id")String id){
        Customer customer = customerService.getById(id);
        return ResultUtil.result(200, customer);
    }

    @GetMapping("/deleteById")
    public ResultUtil deleteById(@RequestParam("id")String id){
        customerService.removeById(id);
        return ResultUtil.result(200);
    }

    @GetMapping("/deleteBatch")
    @Transactional
    public ResultUtil deleteBatch(@RequestParam("ids") String ids){
        List<String> list = Arrays.asList(ids.split(","));
        customerService.removeByIds(list);
        return ResultUtil.result(200);
    }

}
