package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.UserBusiness;
import com.ma.clothes.pojo.entity.UserBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBusinessMapper {
    long countByExample(UserBusinessExample example);

    int deleteByExample(UserBusinessExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserBusiness record);

    int insertSelective(UserBusiness record);

    List<UserBusiness> selectByExample(UserBusinessExample example);

    UserBusiness selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserBusiness record, @Param("example") UserBusinessExample example);

    int updateByExample(@Param("record") UserBusiness record, @Param("example") UserBusinessExample example);

    int updateByPrimaryKeySelective(UserBusiness record);

    int updateByPrimaryKey(UserBusiness record);
}