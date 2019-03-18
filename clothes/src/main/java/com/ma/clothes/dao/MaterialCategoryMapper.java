package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.MaterialCategory;
import com.ma.clothes.pojo.entity.MaterialCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialCategoryMapper {
    long countByExample(MaterialCategoryExample example);

    int deleteByExample(MaterialCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(MaterialCategory record);

    int insertSelective(MaterialCategory record);

    List<MaterialCategory> selectByExample(MaterialCategoryExample example);

    MaterialCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MaterialCategory record, @Param("example") MaterialCategoryExample example);

    int updateByExample(@Param("record") MaterialCategory record, @Param("example") MaterialCategoryExample example);

    int updateByPrimaryKeySelective(MaterialCategory record);

    int updateByPrimaryKey(MaterialCategory record);
}