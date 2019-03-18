package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.AssetInfo;
import com.ma.clothes.pojo.entity.AssetInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetInfoMapper {
    long countByExample(AssetInfoExample example);

    int deleteByExample(AssetInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(AssetInfo record);

    int insertSelective(AssetInfo record);

    List<AssetInfo> selectByExample(AssetInfoExample example);

    AssetInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AssetInfo record, @Param("example") AssetInfoExample example);

    int updateByExample(@Param("record") AssetInfo record, @Param("example") AssetInfoExample example);

    int updateByPrimaryKeySelective(AssetInfo record);

    int updateByPrimaryKey(AssetInfo record);
}