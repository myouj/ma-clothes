package com.ma.clothes.service;

import com.ma.clothes.pojo.entity.Manager;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-03-24
 */
public interface IManagerService extends IService<Manager> {

    Manager getManagerByUsername(String username);

    int validate(String username, String password);

}
