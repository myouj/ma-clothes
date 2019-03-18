package com.ma.clothes.common.status;

public interface UserStatus {

    //用户不存在
    int USERNAME_NO_EXIST = 0;
    //密码错误
    int PASSWORD_ERROR = 1;
    //用户校验异常
    int USER_VALIDATE_EXCEPTION = 2;
    //登陆成功
    int USER_LOGIN_SUCCESS = 3;



}
