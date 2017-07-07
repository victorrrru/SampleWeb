package cn.sample.loan.mapper;

import cn.sample.loan.entity.CreditApply;
import cn.sample.loan.entity.CreditApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditApplyMapper {
    long countByExample(CreditApplyExample example);

    int deleteByExample(CreditApplyExample example);

    int deleteByPrimaryKey(Integer caId);

    int insert(CreditApply record);

    int insertSelective(CreditApply record);

    List<CreditApply> selectByExample(CreditApplyExample example);

    CreditApply selectByPrimaryKey(Integer caId);

    int updateByExampleSelective(@Param("record") CreditApply record, @Param("example") CreditApplyExample example);

    int updateByExample(@Param("record") CreditApply record, @Param("example") CreditApplyExample example);

    int updateByPrimaryKeySelective(CreditApply record);

    int updateByPrimaryKey(CreditApply record);
}