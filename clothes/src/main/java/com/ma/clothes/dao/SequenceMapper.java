package dao;

import entity.Sequence;
import entity.SequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceMapper {
    long countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceExample example);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);
}