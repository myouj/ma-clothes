package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.DocumentHead;
import com.ma.clothes.pojo.entity.DocumentHeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentHeadMapper {
    long countByExample(DocumentHeadExample example);

    int deleteByExample(DocumentHeadExample example);

    int deleteByPrimaryKey(String id);

    int insert(DocumentHead record);

    int insertSelective(DocumentHead record);

    List<DocumentHead> selectByExample(DocumentHeadExample example);

    DocumentHead selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DocumentHead record, @Param("example") DocumentHeadExample example);

    int updateByExample(@Param("record") DocumentHead record, @Param("example") DocumentHeadExample example);

    int updateByPrimaryKeySelective(DocumentHead record);

    int updateByPrimaryKey(DocumentHead record);
}