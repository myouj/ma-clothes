package dao;

import entity.Functions;
import entity.FunctionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionsMapper {
    long countByExample(FunctionsExample example);

    int deleteByExample(FunctionsExample example);

    int insert(Functions record);

    int insertSelective(Functions record);

    List<Functions> selectByExample(FunctionsExample example);

    int updateByExampleSelective(@Param("record") Functions record, @Param("example") FunctionsExample example);

    int updateByExample(@Param("record") Functions record, @Param("example") FunctionsExample example);
}