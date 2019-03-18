package com.ma.clothes.service;

import com.ma.clothes.pojo.entity.User;

import java.util.List;

public interface IUserService {

    User login(String username, String password);

    int validateUser(String loginName, String password);

}
