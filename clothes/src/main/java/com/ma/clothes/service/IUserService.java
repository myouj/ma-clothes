package com.ma.clothes.service;

import com.ma.clothes.pojo.entity.User;

public interface IUserService {

    User login(String username, String password);

}
