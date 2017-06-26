package cn.sample.member.service;

import cn.itht.dto.RequestDto;
import cn.itht.dto.ResultDto;
import cn.itht.mybatis.criteria.Criteria;
import cn.itht.mybatis.criteria.ExpressionFactory;
import cn.sample.member.entity.Member;
import cn.sample.member.mapper.MemberMapper;
import java.io.Serializable;
import java.util.List;

import cn.sample.member.web.bo.MemberDto;
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

	/**
	 * 用户是否注册
	 * @param param
	 * @return
	 */
	public ResultDto isRegisterSer(RequestDto<MemberDto> param) {
		ResultDto result = new ResultDto();
		result.setMsg("用户是否注册");
		MemberDto data = param.getData();
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isNotEmpty(members)) {
			result.setMsg("用户已注册");
			result.setCode("1");
			return result;
		}
		result.setMsg("用户未注册");
		result.setCode("0");
		return result;
	}

	/**
	 * 用户注册
	 * @param param
	 * @return
	 */
	public ResultDto userRegisterSer(RequestDto<MemberDto> param) {
		ResultDto result = new ResultDto();
		result.setMsg("用户注册");
		MemberDto data = param.getData();
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isNotEmpty(members)) {
			result.setMsg("用户已注册");
			result.setCode("1");
			return result;
		}
		Member member = new Member();
		member.setMobileno(data.getMobileno());
		member.setLoginpsw(data.getLoginPwd());
		member.setInvitecode(data.getInviteCode());
		memberMapper.insertSelective(member);
		result.setMsg("注册成功");
		result.setCode("0");
		return result;
	}

	/**
	 * 用户登录
	 * @param param
	 * @return
	 */
	public ResultDto userLoginSer(RequestDto<MemberDto> param) {
		ResultDto result = new ResultDto();
		result.setMsg("用户登录");
		MemberDto data = param.getData();
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isNotEmpty(members)) {
			Member member = members.get(0);
			if (data.getLoginPwd().equals(member.getLoginpsw())) {
				result.setMsg("登录成功");
				result.setCode("0");
				result.setData(member);
			} else {
				result.setMsg("密码错误");
				result.setCode("1");
			}
		} else {
			result.setMsg("用户不存在");
			result.setCode("2");
		}
		return result;
	}

	/**
	 * 修改登录密码
	 * @param param
	 * @return
	 */
	public ResultDto updateLoginPwdSer(RequestDto<MemberDto> param) {
		ResultDto result = new ResultDto();
		result.setMsg("修改登录密码");
		MemberDto data = param.getData();
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isEmpty(members)) {
			result.setMsg("用户不存在");
			result.setCode("2");
		}
		Member memberInfo = members.get(0);
		Member memdto = new Member();
		memdto.setMemid(memberInfo.getMemid());
		memdto.setLoginpsw(data.getNewLoginPwd());
//		if (data.getUpdateLoginPwdType() == 0) {
//			//验证码
//			memberMapper.updateByPrimaryKeySelective(memdto);
//			result.setMsg("忘记密码修改成功");
//			result.setCode("0");
//		} else if (data.getLoginPwd().equals(memberInfo.getLoginpsw())) {
//			memberMapper.updateByPrimaryKeySelective(memdto);
//			result.setMsg("密码修改成功");
//			result.setCode("0");
//		} else {
//			result.setMsg("原密码输入错误");
//			result.setCode("1");
//		}
		switch (data.getUpdateLoginPwdType()) {
			case 0:
				//验证码
				memberMapper.updateByPrimaryKeySelective(memdto);
				result.setMsg("忘记密码修改成功");
				result.setCode("0");
				break;
			case 1:
				if (data.getLoginPwd().equals(memberInfo.getLoginpsw())) {
					memberMapper.updateByPrimaryKeySelective(memdto);
					result.setMsg("密码修改成功");
					result.setCode("0");
				} else {
					result.setMsg("原密码输入错误");
					result.setCode("1");
				}
				break;
		}
		return result;
	}


}