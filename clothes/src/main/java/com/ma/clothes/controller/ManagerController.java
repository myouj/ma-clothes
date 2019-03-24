package com.ma.clothes.controller;


import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.pojo.entity.Manager;
import com.ma.clothes.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-03-24
 */
@RestController
@RequestMapping("//manager")
public class ManagerController {

    @Autowired
    private IManagerService managerService;

    @RequestMapping("/user")
    public ResultUtil getManagerByUsername(@RequestParam("username") String username){
        Manager manager = managerService.getManagerByUsername(username);
        return ResultUtil.result(200, manager);
    }

}
