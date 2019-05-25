package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.common.status.UserStatus;
import com.ma.clothes.pojo.ao.ManagerAO;
import com.ma.clothes.pojo.entity.Manager;
import com.ma.clothes.dao.ManagerMapper;
import com.ma.clothes.service.IManagerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-03-24
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements IManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager getManagerByUsername(String username) {

        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        return managerMapper.selectByMap(map).get(0);
    }

    @Override
    public IPage<Manager> getList(ManagerAO managerAO) {
        Page<Manager> managerPage = new Page<>();
        managerPage.setCurrent(managerAO.getPage());
        managerPage.setSize(managerAO.getRows());

        QueryWrapper<Manager> goodsQueryWrapper = new QueryWrapper<>();
        if(managerAO.getDepartment() != null && !"全部".equals(managerAO.getDepartment())){
            goodsQueryWrapper.eq("department", managerAO.getDepartment());
        }

        if(managerAO.getName() != null && !"".equals(managerAO.getName())){
            goodsQueryWrapper.like("name", managerAO.getName());
        }

        goodsQueryWrapper.orderByAsc("department");

        IPage<Manager> managerIPage = managerMapper.selectPage(managerPage, goodsQueryWrapper);

        return managerIPage;
    }

    @Override
    public int validate(String username, String password) {
        try {
            List<Manager> managers = null;

            QueryWrapper<Manager> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username", username);
            managers = managerMapper.selectList(queryWrapper);

            if(null != managers && managers.size() == 0){
                return UserStatus.USERNAME_NO_EXIST;
            }

            queryWrapper.eq("password", password);
            managers = managerMapper.selectList(queryWrapper);

            if(null != managers && managers.size() == 0){
                return UserStatus.PASSWORD_ERROR;
            }
            return UserStatus.USER_LOGIN_SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return UserStatus.USER_VALIDATE_EXCEPTION;
        }



    }
}
