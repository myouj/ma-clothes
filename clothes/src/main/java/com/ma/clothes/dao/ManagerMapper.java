package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Manager;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author myouj
 * @since 2019-03-24
 */
public interface ManagerMapper extends BaseMapper<Manager> {

    Manager getManagerByUsername(String username);
}
