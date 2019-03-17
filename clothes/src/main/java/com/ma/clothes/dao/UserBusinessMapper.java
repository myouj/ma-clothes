package dao;

import entity.UserBusiness;
import entity.UserBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBusinessMapper {
    long countByExample(UserBusinessExample example);

    int deleteByExample(UserBusinessExample example);

    int insert(UserBusiness record);

    int insertSelective(UserBusiness record);

    List<UserBusiness> selectByExample(UserBusinessExample example);

    int updateByExampleSelective(@Param("record") UserBusiness record, @Param("example") UserBusinessExample example);

    int updateByExample(@Param("record") UserBusiness record, @Param("example") UserBusinessExample example);
}