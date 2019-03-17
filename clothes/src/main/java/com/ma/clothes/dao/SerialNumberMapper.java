package dao;

import entity.SerialNumber;
import entity.SerialNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialNumberMapper {
    long countByExample(SerialNumberExample example);

    int deleteByExample(SerialNumberExample example);

    int insert(SerialNumber record);

    int insertSelective(SerialNumber record);

    List<SerialNumber> selectByExample(SerialNumberExample example);

    int updateByExampleSelective(@Param("record") SerialNumber record, @Param("example") SerialNumberExample example);

    int updateByExample(@Param("record") SerialNumber record, @Param("example") SerialNumberExample example);
}