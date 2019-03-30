package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.pojo.ao.DepotAO;
import com.ma.clothes.pojo.entity.Depot;
import com.ma.clothes.service.IDepotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-03-30
 */
@RestController
@RequestMapping("//depot")
public class DepotController {

    @Autowired
    private IDepotService depotService;

    @GetMapping("/getDepotList")
    public EasyUIUtil getDepotList(DepotAO depotAO){

        IPage<Depot> depotList = depotService.getDepotList(depotAO);

        int total = (int)depotList.getTotal();
        int start = (int)depotList.getCurrent();
        int pageSize = (int)depotList.getPages();
        List<Depot> list = depotList.getRecords();

        return EasyUIUtil.result(start, pageSize, total, list);
    }


}
