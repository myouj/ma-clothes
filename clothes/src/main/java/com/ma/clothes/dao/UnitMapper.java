package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Unit;
import com.ma.clothes.pojo.entity.UnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitMapper {
    long countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(String id);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}