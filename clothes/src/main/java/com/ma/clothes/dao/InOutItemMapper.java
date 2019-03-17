package dao;

import entity.InOutItem;
import entity.InOutItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InOutItemMapper {
    long countByExample(InOutItemExample example);

    int deleteByExample(InOutItemExample example);

    int insert(InOutItem record);

    int insertSelective(InOutItem record);

    List<InOutItem> selectByExample(InOutItemExample example);

    int updateByExampleSelective(@Param("record") InOutItem record, @Param("example") InOutItemExample example);

    int updateByExample(@Param("record") InOutItem record, @Param("example") InOutItemExample example);
}