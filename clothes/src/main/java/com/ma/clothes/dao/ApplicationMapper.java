package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Application;
import com.ma.clothes.pojo.entity.ApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper {
    long countByExample(ApplicationExample example);

    int deleteByExample(ApplicationExample example);

    int deleteByPrimaryKey(String id);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    Application selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}