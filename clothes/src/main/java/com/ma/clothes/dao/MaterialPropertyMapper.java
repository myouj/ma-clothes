package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.MaterialProperty;
import com.ma.clothes.pojo.entity.MaterialPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialPropertyMapper {
    long countByExample(MaterialPropertyExample example);

    int deleteByExample(MaterialPropertyExample example);

    int deleteByPrimaryKey(String id);

    int insert(MaterialProperty record);

    int insertSelective(MaterialProperty record);

    List<MaterialProperty> selectByExample(MaterialPropertyExample example);

    MaterialProperty selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MaterialProperty record, @Param("example") MaterialPropertyExample example);

    int updateByExample(@Param("record") MaterialProperty record, @Param("example") MaterialPropertyExample example);

    int updateByPrimaryKeySelective(MaterialProperty record);

    int updateByPrimaryKey(MaterialProperty record);
}