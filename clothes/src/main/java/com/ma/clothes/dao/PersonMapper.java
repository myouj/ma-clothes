package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Person;
import com.ma.clothes.pojo.entity.PersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(String id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}