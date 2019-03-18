package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Sequence;
import com.ma.clothes.pojo.entity.SequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceMapper {
    long countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceExample example);

    Sequence selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByPrimaryKeySelective(Sequence record);

    int updateByPrimaryKey(Sequence record);
}