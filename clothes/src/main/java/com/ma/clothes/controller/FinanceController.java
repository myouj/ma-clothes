package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.dao.FinanceMapper;
import com.ma.clothes.pojo.ao.FinanceAO;
import com.ma.clothes.pojo.entity.Finance;
import com.ma.clothes.service.IFinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-04-14
 */
@RestController
@RequestMapping("//finance")
public class FinanceController {

    @Autowired
    private IFinanceService financeService;

    @GetMapping("/getList")
    public EasyUIUtil getGoodsList(FinanceAO financeAO){
        IPage<Finance> goodsList = financeService.getList(financeAO);

        int total = (int)goodsList.getTotal();
        int start = (int)goodsList.getCurrent();
        int pageSize = (int)goodsList.getPages();
        List<Finance> list = goodsList.getRecords();

        return EasyUIUtil.result(start,pageSize,total,list);
    }

}
