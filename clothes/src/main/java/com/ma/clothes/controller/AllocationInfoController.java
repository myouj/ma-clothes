package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.status.DepotStatus;
import com.ma.clothes.dao.DepotGoodsMapper;
import com.ma.clothes.pojo.entity.AllocationInfo;
import com.ma.clothes.pojo.entity.DepotGoods;
import com.ma.clothes.pojo.entity.Goods;
import com.ma.clothes.service.IAllocationInfoService;
import com.ma.clothes.service.IDepotGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-04-06
 */
@RestController
@RequestMapping("//allocation-info")
public class AllocationInfoController implements DepotStatus {

    @Autowired
    private IAllocationInfoService allocationInfoService;

    @Autowired
    private IDepotGoodsService depotGoodsService;

    @Autowired
    private DepotGoodsMapper depotGoodsMapper;

    @GetMapping("/getNewNum")
    public ResultUtil getNewNum(){
        int newNum = allocationInfoService.getNewNum();
        return ResultUtil.result(200, newNum + 1);
    }

    @RequestMapping("/insert")
    public ResultUtil insert(AllocationInfo allocationInfo){
        String[] info = allocationInfo.getGoodsInfo().split(";");
        List<DepotGoods> goodsList = new ArrayList<>();
        for(String good : info){
            String[] mune = good.split(":");
            DepotGoods dg = new DepotGoods();
            dg.setGoodsName(mune[0]);
            dg.setCount(Integer.valueOf(mune[1]));
            dg.setUnit(mune[2]);
            goodsList.add(dg);
        }
        int status = DEPOT_ERROR;
        try{
            status = depotGoodsService.save(allocationInfo, goodsList);
        }catch (Exception e){
            e.printStackTrace();
        }

        return ResultUtil.result(200, status);
    }

    /**
     * 测试查询没有的信息是否返回null
     * @return
     */
    @GetMapping("/test")
    public String test(){
        QueryWrapper<DepotGoods> toq = new QueryWrapper<>();
        toq.eq("depot_num", 5);
        toq.eq("goods_name", "菠萝");
        DepotGoods to = depotGoodsMapper.selectOne(toq);
        //如果不存在，直接插入一条数据，如果存在，更新商品库存数量
        if(to == null){
            System.out.println("is null");
        }else{
            System.out.println("not null");
        }
        return "ok";
    }
}
