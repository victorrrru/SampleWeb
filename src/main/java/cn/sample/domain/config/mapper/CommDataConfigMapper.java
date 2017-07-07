package cn.sample.domain.config.mapper;

import cn.sample.domain.config.entity.CommDataConfig;
import cn.sample.domain.config.entity.CommDataConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommDataConfigMapper {
    long countByExample(CommDataConfigExample example);

    int deleteByExample(CommDataConfigExample example);

    int deleteByPrimaryKey(Short menuId);

    int insert(CommDataConfig record);

    int insertSelective(CommDataConfig record);

    List<CommDataConfig> selectByExample(CommDataConfigExample example);

    CommDataConfig selectByPrimaryKey(Short menuId);

    int updateByExampleSelective(@Param("record") CommDataConfig record, @Param("example") CommDataConfigExample example);

    int updateByExample(@Param("record") CommDataConfig record, @Param("example") CommDataConfigExample example);

    int updateByPrimaryKeySelective(CommDataConfig record);

    int updateByPrimaryKey(CommDataConfig record);
}