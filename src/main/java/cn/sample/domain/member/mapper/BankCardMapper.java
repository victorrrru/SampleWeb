package cn.sample.domain.member.mapper;

import cn.sample.domain.member.entity.BankCard;
import cn.sample.domain.member.entity.BankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankCardMapper {
    long countByExample(BankCardExample example);

    int deleteByExample(BankCardExample example);

    int deleteByPrimaryKey(Integer bcid);

    int insert(BankCard record);

    int insertSelective(BankCard record);

    List<BankCard> selectByExample(BankCardExample example);

    BankCard selectByPrimaryKey(Integer bcid);

    int updateByExampleSelective(@Param("record") BankCard record, @Param("example") BankCardExample example);

    int updateByExample(@Param("record") BankCard record, @Param("example") BankCardExample example);

    int updateByPrimaryKeySelective(BankCard record);

    int updateByPrimaryKey(BankCard record);
}