package dao;

import entity.AccountHead;
import entity.AccountHeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountHeadMapper {
    long countByExample(AccountHeadExample example);

    int deleteByExample(AccountHeadExample example);

    int insert(AccountHead record);

    int insertSelective(AccountHead record);

    List<AccountHead> selectByExample(AccountHeadExample example);

    int updateByExampleSelective(@Param("record") AccountHead record, @Param("example") AccountHeadExample example);

    int updateByExample(@Param("record") AccountHead record, @Param("example") AccountHeadExample example);
}