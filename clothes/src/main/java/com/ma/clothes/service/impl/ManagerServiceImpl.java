package com.ma.clothes.service.impl;

import com.ma.clothes.pojo.entity.Manager;
import com.ma.clothes.dao.ManagerMapper;
import com.ma.clothes.service.IManagerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
        return managerMapper.getManagerByUsername(username);
    }
}
