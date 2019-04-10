package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.status.DepotStatus;
import com.ma.clothes.dao.DepotGoodsMapper;
import com.ma.clothes.pojo.ao.AllocationAO;
import com.ma.clothes.pojo.dto.GoodsDTO;
import com.ma.clothes.pojo.entity.AllocationInfo;
import com.ma.clothes.pojo.entity.DepotGoods;
import com.ma.clothes.pojo.entity.Goods;
import com.ma.clothes.service.IAllocationInfoService;
import com.ma.clothes.service.IDepotGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
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
 * @since 2019-04-06
 */
@RestController
@RequestMapping("//allocation-info")
public class AllocationInfoController implements DepotStatus {

    @Autowired
    private IAllocationInfoService allocationInfoService;

    @Autowired
    private IDepotGoodsService depotGoodsService;


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

    @GetMapping("/getAllocationList")
   public EasyUIUtil getAllocationList(AllocationAO allocationAO){
        IPage<AllocationInfo> allocationList = allocationInfoService.getAllocationList(allocationAO);
        int total = (int)allocationList.getTotal();
        int start = (int)allocationList.getCurrent();
        int pageSize = (int)allocationList.getPages();
        List<AllocationInfo> list = allocationList.getRecords();
        return EasyUIUtil.result(start,pageSize,total,list);
    }

    @GetMapping("/getAllocationById")
    public ResultUtil getAllocationById(@RequestParam("id")String id){
        AllocationInfo all = allocationInfoService.getById(id);

        String goodsInfo = all.getGoodsInfo();

        String[] sp = goodsInfo.split(";");
        List<GoodsDTO> goodsDTOS = new ArrayList<>();
        for(String g : sp){
            GoodsDTO goodsDTO = new GoodsDTO();
            String[] good = g.split(":");
            goodsDTO.setGoods(good[0]);
            goodsDTO.setCount(Integer.valueOf(good[1]));
            goodsDTO.setUnit(good[2]);
            goodsDTOS.add(goodsDTO);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("all", all);
        map.put("goods", goodsDTOS);

        return ResultUtil.result(200, map);
    }
}
