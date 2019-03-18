package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.AccountHead;
import com.ma.clothes.pojo.entity.AccountHeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountHeadMapper {
    long countByExample(AccountHeadExample example);

    int deleteByExample(AccountHeadExample example);

    int deleteByPrimaryKey(String id);

    int insert(AccountHead record);

    int insertSelective(AccountHead record);

    List<AccountHead> selectByExample(AccountHeadExample example);

    AccountHead selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AccountHead record, @Param("example") AccountHeadExample example);

    int updateByExample(@Param("record") AccountHead record, @Param("example") AccountHeadExample example);

    int updateByPrimaryKeySelective(AccountHead record);

    int updateByPrimaryKey(AccountHead record);
}