package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.DocumentItem;
import com.ma.clothes.pojo.entity.DocumentItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentItemMapper {
    long countByExample(DocumentItemExample example);

    int deleteByExample(DocumentItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocumentItem record);

    int insertSelective(DocumentItem record);

    List<DocumentItem> selectByExample(DocumentItemExample example);

    DocumentItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocumentItem record, @Param("example") DocumentItemExample example);

    int updateByExample(@Param("record") DocumentItem record, @Param("example") DocumentItemExample example);

    int updateByPrimaryKeySelective(DocumentItem record);

    int updateByPrimaryKey(DocumentItem record);
}