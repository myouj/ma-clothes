package com.ma.clothes.service.impl;

import com.ma.clothes.dao.UserMapper;
import com.ma.clothes.pojo.entity.User;
import com.ma.clothes.pojo.entity.UserExample;
import com.ma.clothes.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() == 0){
            return null;
        }
        return users.get(0);
    }
}
