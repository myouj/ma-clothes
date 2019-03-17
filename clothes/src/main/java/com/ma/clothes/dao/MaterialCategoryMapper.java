package dao;

import entity.MaterialCategory;
import entity.MaterialCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialCategoryMapper {
    long countByExample(MaterialCategoryExample example);

    int deleteByExample(MaterialCategoryExample example);

    int insert(MaterialCategory record);

    int insertSelective(MaterialCategory record);

    List<MaterialCategory> selectByExample(MaterialCategoryExample example);

    int updateByExampleSelective(@Param("record") MaterialCategory record, @Param("example") MaterialCategoryExample example);

    int updateByExample(@Param("record") MaterialCategory record, @Param("example") MaterialCategoryExample example);
}