package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Functions;
import com.ma.clothes.pojo.entity.FunctionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionsMapper {
    long countByExample(FunctionsExample example);

    int deleteByExample(FunctionsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Functions record);

    int insertSelective(Functions record);

    List<Functions> selectByExample(FunctionsExample example);

    Functions selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Functions record, @Param("example") FunctionsExample example);

    int updateByExample(@Param("record") Functions record, @Param("example") FunctionsExample example);

    int updateByPrimaryKeySelective(Functions record);

    int updateByPrimaryKey(Functions record);
}