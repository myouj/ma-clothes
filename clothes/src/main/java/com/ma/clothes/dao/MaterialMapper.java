package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Material;
import com.ma.clothes.pojo.entity.MaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialMapper {
    long countByExample(MaterialExample example);

    int deleteByExample(MaterialExample example);

    int deleteByPrimaryKey(String id);

    int insert(Material record);

    int insertSelective(Material record);

    List<Material> selectByExample(MaterialExample example);

    Material selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}