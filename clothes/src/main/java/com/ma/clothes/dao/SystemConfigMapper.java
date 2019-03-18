package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.SystemConfig;
import com.ma.clothes.pojo.entity.SystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemConfigMapper {
    long countByExample(SystemConfigExample example);

    int deleteByExample(SystemConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    List<SystemConfig> selectByExample(SystemConfigExample example);

    SystemConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    int updateByExample(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);
}