package dao;

import entity.AccountItem;
import entity.AccountItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountItemMapper {
    long countByExample(AccountItemExample example);

    int deleteByExample(AccountItemExample example);

    int insert(AccountItem record);

    int insertSelective(AccountItem record);

    List<AccountItem> selectByExample(AccountItemExample example);

    int updateByExampleSelective(@Param("record") AccountItem record, @Param("example") AccountItemExample example);

    int updateByExample(@Param("record") AccountItem record, @Param("example") AccountItemExample example);
}