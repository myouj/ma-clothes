package dao;

import entity.AssetInfo;
import entity.AssetInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetInfoMapper {
    long countByExample(AssetInfoExample example);

    int deleteByExample(AssetInfoExample example);

    int insert(AssetInfo record);

    int insertSelective(AssetInfo record);

    List<AssetInfo> selectByExample(AssetInfoExample example);

    int updateByExampleSelective(@Param("record") AssetInfo record, @Param("example") AssetInfoExample example);

    int updateByExample(@Param("record") AssetInfo record, @Param("example") AssetInfoExample example);
}