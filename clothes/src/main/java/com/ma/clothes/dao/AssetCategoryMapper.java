package dao;

import entity.AssetCategory;
import entity.AssetCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetCategoryMapper {
    long countByExample(AssetCategoryExample example);

    int deleteByExample(AssetCategoryExample example);

    int insert(AssetCategory record);

    int insertSelective(AssetCategory record);

    List<AssetCategory> selectByExample(AssetCategoryExample example);

    int updateByExampleSelective(@Param("record") AssetCategory record, @Param("example") AssetCategoryExample example);

    int updateByExample(@Param("record") AssetCategory record, @Param("example") AssetCategoryExample example);
}