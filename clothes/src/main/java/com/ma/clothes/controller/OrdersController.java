package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.entity.Orders;
import com.ma.clothes.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-04-23
 */
@RestController
@RequestMapping("//orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;


    @GetMapping("/getNewNum")
    public ResultUtil getNewNum(){
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("number", "select max(number) from orders");
        Orders one = ordersService.getOne(queryWrapper);
        return ResultUtil.result(200, one.getNumber() + 1);
    }


    @PostMapping("/insert")
    public ResultUtil insert(Orders orders){
        orders.setId(StringUtils.getUUID());
        orders.setStatus((byte)0);
        try{
            ordersService.save(orders);
            return ResultUtil.result(200);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
    }

    @GetMapping("/deleteById")
    public ResultUtil deleteById(@RequestParam("id")String id){
        try {
            ordersService.removeById(id);
            return ResultUtil.result(200);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
    }


    @GetMapping("/check")
    public ResultUtil check(@RequestParam("id")String id,
                            @RequestParam("operator")String operator){
        try{
            Orders orders = ordersService.getById(id);
            orders.setOperator(orders.getOperator() + operator);
            orders.setStatus((byte)1);
            ordersService.updateById(orders);
            return ResultUtil.result(200);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
    }



}
