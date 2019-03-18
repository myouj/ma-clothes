package com.ma.clothes.service.impl;

import com.ma.clothes.common.status.UserStatus;
import com.ma.clothes.dao.UserMapper;
import com.ma.clothes.pojo.entity.User;
import com.ma.clothes.pojo.entity.UserExample;
import com.ma.clothes.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(username).andPasswordEqualTo(password);
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
            System.out.println("22222");
        }
        return 0;
    }
}
