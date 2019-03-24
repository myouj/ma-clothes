package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ma.clothes.common.status.UserStatus;
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
    public int validate(String username, String password) {
        try {
            List<Manager> managers = null;

            try{
                Map<String, Object> map = new HashMap<>();
                map.put("username", username);
                managers = managerMapper.selectByMap(map);
            }catch (Exception e){
                e.printStackTrace();
            }

            if(null != managers && managers.size() == 0){
                return UserStatus.USERNAME_NO_EXIST;
            }

            try{
                Map<String, Object> map = new HashMap<>();
                map.put("username", username);
                map.put("password", password);
                managers = managerMapper.selectByMap(map);
            }catch (Exception e){
                e.printStackTrace();
            }

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
