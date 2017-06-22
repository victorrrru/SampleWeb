package cn.sample.api.test.service;

import cn.itht.dto.RequestDto;
import cn.itht.dto.ResultDto;
import cn.itht.mybatis.criteria.Criteria;
import cn.itht.mybatis.criteria.ExpressionFactory;
import cn.sample.api.test.entity.Member;
import cn.sample.api.test.mapper.MemberMapper;
import java.io.Serializable;
import java.util.List;

import cn.sample.api.test.web.bo.MemberDto;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务实现层 - 表：member
 * @since 2017-06-14 14:34:10
 */
@Service()
public class MemberService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private MemberMapper memberMapper;

	public ResultDto userRegisterSer(RequestDto<MemberDto> param) {
		ResultDto result = new ResultDto();
		result.setMsg("用户登录");
		result.setCode("0");
		MemberDto data = param.getData();
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobile())));
		if (CollectionUtils.isNotEmpty(members)) {
			result.setCode("1");
			result.setMsg("用户已注册");
			return result;
		}
		Member member = new Member();
		member.setMobileno(data.getMobile());
		member.setIdcardno(data.getIdcardno());
		member.setLoginpsw(data.getLoginpsw());
		member.setRealname(data.getRealname());
		memberMapper.insertSelective(member);
		return result;
	}

}