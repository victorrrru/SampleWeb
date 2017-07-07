package cn.sample.domain.member.mapper;

import cn.sample.domain.member.entity.MemberPicResources;
import cn.sample.domain.member.entity.MemberPicResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberPicResourcesMapper {
    long countByExample(MemberPicResourcesExample example);

    int deleteByExample(MemberPicResourcesExample example);

    int deleteByPrimaryKey(Integer memresid);

    int insert(MemberPicResources record);

    int insertSelective(MemberPicResources record);

    List<MemberPicResources> selectByExample(MemberPicResourcesExample example);

    MemberPicResources selectByPrimaryKey(Integer memresid);

    int updateByExampleSelective(@Param("record") MemberPicResources record, @Param("example") MemberPicResourcesExample example);

    int updateByExample(@Param("record") MemberPicResources record, @Param("example") MemberPicResourcesExample example);

    int updateByPrimaryKeySelective(MemberPicResources record);

    int updateByPrimaryKey(MemberPicResources record);
}