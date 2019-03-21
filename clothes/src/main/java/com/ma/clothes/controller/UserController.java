package com.ma.clothes.controller;

import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.status.UserStatus;
import com.ma.clothes.pojo.entity.User;
import com.ma.clothes.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResultUtil userLogin(@RequestParam(value = "username", required = false)String username,
                                @RequestParam(value = "password", required = false)String password,
                                HttpServletRequest request){

        username = username.trim();
        password = password.trim();

        User sessionUser = (User) request.getSession().getAttribute("user");

        if(sessionUser != null && username.equals(sessionUser.getLoginName()) && password.equals(sessionUser.getPassword())){
            return ResultUtil.result(UserStatus.USER_LOGIN_SUCCESS, "login success", sessionUser);
        }

        int status = userService.validateUser(username, password);

        User user = null;
        if(status == UserStatus.USER_LOGIN_SUCCESS){
            user = userService.selectUserByLoginName(username);
        }

        request.getSession().setAttribute("user", user);
        return ResultUtil.result(status, "request success", user);
    }

    @GetMapping("/getUserSession")
    public ResultUtil getUserSession(HttpServletRequest request){
        try{
            User user = (User) request.getSession().getAttribute("user");
            if(user != null){
                user.setPassword(null);
            }
            return ResultUtil.result(200, user);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500, "get session fail");
        }

    }

}
