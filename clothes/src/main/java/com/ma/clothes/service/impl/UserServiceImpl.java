package com.ma.clothes.service.impl;

import com.ma.clothes.common.status.UserStatus;
import com.ma.clothes.dao.UserMapper;
import com.ma.clothes.pojo.entity.User;
import com.ma.clothes.pojo.entity.UserExample;
import com.ma.clothes.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUserByLoginName(String loginName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(loginName);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() == 0){
            return null;
        }
        return users.get(0);
    }

    @Override
    public int validateUser(String loginName, String password) {

        List<User> users = null;
        try {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andLoginNameEqualTo(loginName);
            users = userMapper.selectByExample(userExample);
        }catch (Exception e){
            return UserStatus.USER_VALIDATE_EXCEPTION;
        }
        if(null != users && users.size() == 0){
            return UserStatus.USERNAME_NO_EXIST;
        }

        try{
            UserExample userExample = new UserExample();
            userExample.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password);
            users = userMapper.selectByExample(userExample);
        }catch (Exception e){
            return UserStatus.USER_VALIDATE_EXCEPTION;
        }

        if(null != users && users.size() == 0){
            return UserStatus.PASSWORD_ERROR;
        }

        return UserStatus.USER_LOGIN_SUCCESS;

    }
}
