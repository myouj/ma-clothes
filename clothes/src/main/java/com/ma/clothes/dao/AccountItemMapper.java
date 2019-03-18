package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.AccountItem;
import com.ma.clothes.pojo.entity.AccountItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountItemMapper {
    long countByExample(AccountItemExample example);

    int deleteByExample(AccountItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(AccountItem record);

    int insertSelective(AccountItem record);

    List<AccountItem> selectByExample(AccountItemExample example);

    AccountItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AccountItem record, @Param("example") AccountItemExample example);

    int updateByExample(@Param("record") AccountItem record, @Param("example") AccountItemExample example);

    int updateByPrimaryKeySelective(AccountItem record);

    int updateByPrimaryKey(AccountItem record);
}