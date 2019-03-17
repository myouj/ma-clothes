package dao;

import entity.DocumentItem;
import entity.DocumentItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentItemMapper {
    long countByExample(DocumentItemExample example);

    int deleteByExample(DocumentItemExample example);

    int insert(DocumentItem record);

    int insertSelective(DocumentItem record);

    List<DocumentItem> selectByExample(DocumentItemExample example);

    int updateByExampleSelective(@Param("record") DocumentItem record, @Param("example") DocumentItemExample example);

    int updateByExample(@Param("record") DocumentItem record, @Param("example") DocumentItemExample example);
}