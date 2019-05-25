package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.status.UserStatus;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.ao.ManagerAO;
import com.ma.clothes.pojo.entity.Manager;
import com.ma.clothes.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    /**
     * 登陆
     * @param username
     * @param password
     * @param request
     * @return
     */
    @PostMapping("/login")
    public ResultUtil login(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request){


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

    /**
     * 获取session
     * @param request
     * @return
     */
    @GetMapping("/getSession")
    public ResultUtil getSession(HttpServletRequest request){
        Manager manager = (Manager) request.getSession().getAttribute("manager");
        if(manager != null){
            manager.setPassword(null);
            return ResultUtil.result(UserStatus.SESSION_NOT_NULL, manager);
        }
        return ResultUtil.result(UserStatus.SESSION_IS_NULL);
    }

    @GetMapping("getList")
    public EasyUIUtil getList(ManagerAO managerAO){
        IPage<Manager> goodsList = managerService.getList(managerAO);

        int total = (int)goodsList.getTotal();
        int start = (int)goodsList.getCurrent();
        int pageSize = (int)goodsList.getPages();
        List<Manager> list = goodsList.getRecords();

        return EasyUIUtil.result(start,pageSize,total,list);
    }

    @PostMapping("saveManager")
    public ResultUtil save(Manager manager){

        if(manager.getId() != null && !"".equals(manager.getId())){
            managerService.updateById(manager);
            return ResultUtil.result(200, 2);
        } else {
            QueryWrapper<Manager> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username", manager.getUsername());
            Manager one = managerService.getOne(queryWrapper);
            if(one == null) {
                manager.setId(StringUtils.getUUID());
                managerService.save(manager);
                return ResultUtil.result(200, 3);
            }
        }
        return ResultUtil.result(500, "账号已存在");
    }

    @GetMapping("getById")
    public ResultUtil getById(@RequestParam("id") String id){
        Manager manager = managerService.getById(id);
        return ResultUtil.result(200, manager);
    }

    @GetMapping("deleteById")
    public ResultUtil deleteById(@RequestParam("id")String id){
        managerService.removeById(id);
        return ResultUtil.result(200);
    }

    @GetMapping("resetPassword")
    public ResultUtil resetPassword(@RequestParam("id")String id){
        UpdateWrapper<Manager> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", id).set("password", "huayuge");
        managerService.update(updateWrapper);
        return ResultUtil.result(200);
    }
}
