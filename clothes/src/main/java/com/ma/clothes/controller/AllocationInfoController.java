package com.ma.clothes.controller;


import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.service.IAllocationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
public class AllocationInfoController {

    @Autowired
    private IAllocationInfoService allocationInfoService;

    @GetMapping("/getNewNum")
    public ResultUtil getNewNum(){
        int newNum = allocationInfoService.getNewNum();
        return ResultUtil.result(200, newNum + 1);
    }
}
