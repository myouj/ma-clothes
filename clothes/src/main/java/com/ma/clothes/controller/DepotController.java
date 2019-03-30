package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.ao.DepotAO;
import com.ma.clothes.pojo.entity.Depot;
import com.ma.clothes.service.IDepotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    @GetMapping("/getNewNum")
    public ResultUtil getNewNum(){
        int newNum = depotService.getNewNum();
        return ResultUtil.result(200, newNum + 1);
    }

    @PostMapping("/insertDepot")
    public ResultUtil insertDepot(Depot depot){
        int i;
        if(depot.getId() != null && depot.getId() != ""){
            depotService.updateDepot(depot);
            i = 2;
        }else {
            depot.setId(StringUtils.getUUID());
            depotService.insertDepot(depot);
            i = 3;
        }

        if(i == 2 || i == 3){
            return ResultUtil.result(200,i);
        }else{
            return ResultUtil.result(500);
        }
    }

    @GetMapping("/delectBatchByIds")
    public ResultUtil delectBatchByIds(@RequestParam("ids") String ids){
        String[] s = ids.split(",");
        List<String> list = Arrays.asList(s);
        try{
            depotService.deleteBatchById(list);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
        return ResultUtil.result(200);
    }

    @GetMapping("/deleteById")
    public ResultUtil deleteById(String id){
        try{
            depotService.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500);
        }
        return ResultUtil.result(200);
    }

    @GetMapping("/selectById")
    public ResultUtil selectById(String id){
        Depot depot = depotService.selectById(id);
        return ResultUtil.result(200, depot);
    }

}
