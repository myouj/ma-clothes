package dao;

import entity.OrganizationUserRelationship;
import entity.OrganizationUserRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationUserRelationshipMapper {
    long countByExample(OrganizationUserRelationshipExample example);

    int deleteByExample(OrganizationUserRelationshipExample example);

    int insert(OrganizationUserRelationship record);

    int insertSelective(OrganizationUserRelationship record);

    List<OrganizationUserRelationship> selectByExample(OrganizationUserRelationshipExample example);

    int updateByExampleSelective(@Param("record") OrganizationUserRelationship record, @Param("example") OrganizationUserRelationshipExample example);

    int updateByExample(@Param("record") OrganizationUserRelationship record, @Param("example") OrganizationUserRelationshipExample example);
}