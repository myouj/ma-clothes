package com.ma.clothes.controller;


import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.status.UserStatus;
import com.ma.clothes.pojo.entity.Manager;
import com.ma.clothes.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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

    @PostMapping("/login")
    public ResultUtil login(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request){

        username = username.trim();
        password = password.trim();

        Manager manager = (Manager) request.getSession().getAttribute("manager");
        if(manager != null){
            if(username.equals(manager.getUsername()) && password.equals(manager.getPassword())){
                return ResultUtil.result(UserStatus.USER_LOGIN_SUCCESS, "request success");
            }
        }

        int status = managerService.validate(username, password);
        if(status != UserStatus.USER_LOGIN_SUCCESS){
            return ResultUtil.result(status, "login fail");
        }

        manager = managerService.getManagerByUsername(username);
        request.getSession().setAttribute("manager", manager);
        return ResultUtil.result(status, "login success");
    }

    @GetMapping("/getSession")
    public ResultUtil getSession(HttpServletRequest request){
        Manager manager = (Manager) request.getSession().getAttribute("manager");
        if(manager != null){
            manager.setPassword(null);
            return ResultUtil.result(UserStatus.SESSION_NOT_NULL, manager);
        }
        return ResultUtil.result(UserStatus.SESSION_IS_NULL);
    }

}
