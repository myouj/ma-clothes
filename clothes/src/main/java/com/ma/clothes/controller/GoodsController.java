package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.ao.GoodsAO;
import com.ma.clothes.pojo.entity.Goods;
import com.ma.clothes.service.IGoodsService;
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
 * @since 2019-04-01
 */
@RestController
@RequestMapping("//goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @GetMapping("/getGoodsList")
    public EasyUIUtil getGoodsList(GoodsAO goodsAO){
        IPage<Goods> goodsList = goodsService.getGoodsList(goodsAO);

        int total = (int)goodsList.getTotal();
        int start = (int)goodsList.getCurrent();
        int pageSize = (int)goodsList.getPages();
        List<Goods> list = goodsList.getRecords();

        return EasyUIUtil.result(start,pageSize,total,list);
    }

    @GetMapping("/getNewNumber")
    public ResultUtil getNewNumber(){
        int newNumber = goodsService.getNewNumber();
        return ResultUtil.result(200, newNumber + 1);
    }

    @GetMapping("/getGoodsById")
    public ResultUtil getGoodsById(@RequestParam("id")String id){
        Goods goods = goodsService.getGoodsById(id);
        return ResultUtil.result(200, goods);
    }

    @PostMapping("/saveGoods")
    public ResultUtil saveGoods(Goods goods){
        System.out.println(goods);
        if(goods.getId() != null && !"".equals(goods.getId())){
            goodsService.updateGoods(goods);
            return ResultUtil.result(200, 2);

        }else{
            QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("name", goods.getName());
            Goods one = goodsService.getOne(queryWrapper);
            if(one == null){
                goods.setId(StringUtils.getUUID());
                goodsService.insert(goods);
                return ResultUtil.result(200, 3);
            }
        }

        return ResultUtil.result(500, "商品已存在");
    }

    @GetMapping("/deleteGoodsById")
    public ResultUtil deleteGoodsById(@RequestParam("id")String id){
        try {
            goodsService.deleteGoods(id);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
        return ResultUtil.result(200);
    }

    @GetMapping("/deleteBatchByIds")
    public ResultUtil deleteBatchByIds(@RequestParam("ids") String ids){
        String[] s = ids.split(",");
        List<String> list = Arrays.asList(s);
        try{
            goodsService.deleteBatchByIds(list);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
        return ResultUtil.result(200);
    }

    @GetMapping("/getGoods")
    public List<Goods> getGoodsList(){
        List<Goods> list = goodsService.list();
        return list;
    }

    @GetMapping("/getGoodsByName")
    public ResultUtil getGoodsByName(@RequestParam("name")String name){
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        Goods one = goodsService.getOne(queryWrapper);
        return ResultUtil.result(200, one);
    }


}
