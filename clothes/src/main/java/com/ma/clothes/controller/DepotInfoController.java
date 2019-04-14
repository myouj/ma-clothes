package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.pojo.ao.DepotInfoAO;
import com.ma.clothes.pojo.dto.GoodsDTO;
import com.ma.clothes.pojo.entity.DepotInfo;
import com.ma.clothes.service.IDepotInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
 * @since 2019-04-11
 */
@RestController
@RequestMapping("//depot-info")
public class DepotInfoController {

    @Autowired
    private IDepotInfoService depotInfoService;

    @GetMapping("/getList")
    public EasyUIUtil getList(DepotInfoAO depotInfoAO){
        IPage<DepotInfo> allocationList = depotInfoService.getList(depotInfoAO);
        int total = (int)allocationList.getTotal();
        int start = (int)allocationList.getCurrent();
        int pageSize = (int)allocationList.getPages();
        List<DepotInfo> list = allocationList.getRecords();
        return EasyUIUtil.result(start, pageSize, total, list);
    }

    @GetMapping("/getById")
    public ResultUtil getById(@RequestParam("id") String id){
        DepotInfo depotInfo = depotInfoService.getById(id);
        List<GoodsDTO> goodsDTOS = new ArrayList<>();

        String[] split = depotInfo.getGoodsInfo().split(";");
        for(String s : split){
            GoodsDTO goodsDTO = new GoodsDTO();
            String[] goods = s.split(":");
            goodsDTO.setNum(Integer.valueOf(goods[0]));
            goodsDTO.setGoods(goods[1]);
            goodsDTO.setCount(Integer.valueOf(goods[2]));
            goodsDTO.setPrice(Double.valueOf(goods[3]));
            goodsDTO.setUnit(goods[4]);
            goodsDTOS.add(goodsDTO);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("all", depotInfo);
        map.put("goods", goodsDTOS);

        return ResultUtil.result(200, map);
    }

}
