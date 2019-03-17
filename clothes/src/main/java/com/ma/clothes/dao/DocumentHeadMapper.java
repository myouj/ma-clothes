package dao;

import entity.DocumentHead;
import entity.DocumentHeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentHeadMapper {
    long countByExample(DocumentHeadExample example);

    int deleteByExample(DocumentHeadExample example);

    int insert(DocumentHead record);

    int insertSelective(DocumentHead record);

    List<DocumentHead> selectByExample(DocumentHeadExample example);

    int updateByExampleSelective(@Param("record") DocumentHead record, @Param("example") DocumentHeadExample example);

    int updateByExample(@Param("record") DocumentHead record, @Param("example") DocumentHeadExample example);
}