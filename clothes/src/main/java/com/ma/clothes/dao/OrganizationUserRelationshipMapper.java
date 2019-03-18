package com.ma.clothes.dao;

import com.ma.clothes.pojo.entity.OrganizationUserRelationship;
import com.ma.clothes.pojo.entity.OrganizationUserRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationUserRelationshipMapper {
    long countByExample(OrganizationUserRelationshipExample example);

    int deleteByExample(OrganizationUserRelationshipExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrganizationUserRelationship record);

    int insertSelective(OrganizationUserRelationship record);

    List<OrganizationUserRelationship> selectByExample(OrganizationUserRelationshipExample example);

    OrganizationUserRelationship selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrganizationUserRelationship record, @Param("example") OrganizationUserRelationshipExample example);

    int updateByExample(@Param("record") OrganizationUserRelationship record, @Param("example") OrganizationUserRelationshipExample example);

    int updateByPrimaryKeySelective(OrganizationUserRelationship record);

    int updateByPrimaryKey(OrganizationUserRelationship record);
}