package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.AssetCategory;
import com.ma.clothes.pojo.entity.AssetCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetCategoryMapper {
    long countByExample(AssetCategoryExample example);

    int deleteByExample(AssetCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(AssetCategory record);

    int insertSelective(AssetCategory record);

    List<AssetCategory> selectByExample(AssetCategoryExample example);

    AssetCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AssetCategory record, @Param("example") AssetCategoryExample example);

    int updateByExample(@Param("record") AssetCategory record, @Param("example") AssetCategoryExample example);

    int updateByPrimaryKeySelective(AssetCategory record);

    int updateByPrimaryKey(AssetCategory record);
}