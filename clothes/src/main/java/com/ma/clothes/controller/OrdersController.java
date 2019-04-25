package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.ao.OrdersAO;
import com.ma.clothes.pojo.dto.GoodsDTO;
import com.ma.clothes.pojo.entity.Orders;
import com.ma.clothes.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResultUtil insert(Orders orders, @RequestParam("do")Boolean in){
        orders.setId(StringUtils.getUUID());
        if(in){
            orders.setStatus((byte)0);
        }else{
            orders.setStatus((byte)3);
        }
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
            orders.setOperator(orders.getOperator() + "," + operator);
            orders.setStatus((byte)1);
            ordersService.updateById(orders);
            return ResultUtil.result(200);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
    }

    @GetMapping("/getList")
    public EasyUIUtil getList(OrdersAO ordersAO, @RequestParam("do")Boolean in){
        IPage<Orders> iPage = ordersService.getList(ordersAO, in);
        int total = (int) iPage.getTotal();
        int start = (int) iPage.getCurrent();
        int pageSize = (int) iPage.getPages();
        List<Orders> list = iPage.getRecords();
        return EasyUIUtil.result(start, pageSize, total, list);
    }

    @GetMapping("/getDetail")
    public ResultUtil getDetail(@RequestParam("id")String id){
        Orders orders = ordersService.getById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("all", orders);
        String[] split = orders.getGoodsInfo().split(";");
        List<GoodsDTO> list = new ArrayList<>();
        for(String s : split){
            String[] goods = s.split(":");
            GoodsDTO goodsDTO = new GoodsDTO();
            goodsDTO.setNum(Integer.valueOf(goods[0]));
            goodsDTO.setGoods(goods[1]);
            goodsDTO.setCount(Integer.valueOf(goods[2]));
            goodsDTO.setPrice(Double.valueOf(goods[3]));
            goodsDTO.setUnit(goods[4]);
            list.add(goodsDTO);
        }
        map.put("goods", list);
        return ResultUtil.result(200, map);
    }

    @GetMapping("/out")
    public ResultUtil out(@RequestParam("id")String id,
                          @RequestParam("operator")String operator){
        try {
            ordersService.out(id, operator);
            return ResultUtil.result(200);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
    }

    @GetMapping("/checkReturn")
    public ResultUtil checkReturn(@RequestParam("id")String id,
                                  @RequestParam("operator")String operator){
        try{
            ordersService.checkReturn(id, operator);
            return ResultUtil.result(200);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
    }

}
