package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.pojo.ao.DepotGoodsAO;
import com.ma.clothes.pojo.entity.DepotGoods;
import com.ma.clothes.service.IDepotGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-04-02
 */
@RestController
@RequestMapping("//depot-goods")
public class DepotGoodsController {

    @Autowired
    private IDepotGoodsService depotGoodsService;

    @GetMapping("/getDepotGoodsList")
    public EasyUIUtil getDepotGoodsList(DepotGoodsAO depotGoodsAO){
        IPage<DepotGoods> iPage = depotGoodsService.getDepotGoodsList(depotGoodsAO);
        int total = (int)iPage.getTotal();
        int start = (int)iPage.getCurrent();
        int pageSize = (int)iPage.getPages();
        List<DepotGoods> list = iPage.getRecords();
        return EasyUIUtil.result(start, pageSize, total, list);
    }

    @GetMapping("/getDepotGoodsByDnum")
    public List<DepotGoods> getDepotGoodsByDnum(@RequestParam("depotNum") String depotNum){
        List<DepotGoods> list = depotGoodsService.getDepotGoodsByDnumber(depotNum);
        return list;
    }

    @GetMapping("/getCountsByDnumAndGoods")
    public ResultUtil getCountsByDnumAndGoods(@RequestParam("depotNum") Integer depotNum,
                                              @RequestParam("goodsName") String goodsName){
        DepotGoods goods = depotGoodsService.getDepotByDnumAndGoods(depotNum, goodsName);
        return ResultUtil.result(200, goods);
    }

}
