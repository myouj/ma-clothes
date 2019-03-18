package com.ma.clothes.controller;

import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.pojo.entity.User;
import com.ma.clothes.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResultUtil userLogin(@RequestParam(value = "username", required = false)String username,
                                @RequestParam(value = "password", required = false)String password){
        User user = userService.login(username, password);
        userService.validateUser(username, password);
        return ResultUtil.result(200, "登陆成功", user);
    }

}
