package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.Organization;
import com.ma.clothes.pojo.entity.OrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    long countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(String id);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}