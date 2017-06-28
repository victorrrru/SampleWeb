package cn.sample.member.service;

import cn.itht.dto.RequestDto;
import cn.itht.dto.ResultDto;
import cn.itht.mybatis.criteria.Criteria;
import cn.itht.mybatis.criteria.ExpressionFactory;
import cn.sample.common.AliTools;
import cn.sample.common.Configs;
import cn.sample.member.entity.Member;
import cn.sample.member.mapper.MemberMapper;
import java.io.Serializable;
import java.util.List;

import cn.sample.member.web.bo.MemberDto;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
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
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	/**
	 * 用户是否注册
	 * @param data
	 * @return
	 */
	public ResultDto isRegisterSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("用户是否注册");
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isNotEmpty(members)) {
			result.setMsg("用户已注册");
			result.setCode("1");
		} else {
			result.setMsg("用户未注册");
		}
		return result;
	}

	/**
	 * 发送短信验证码
	 * @param data
	 * @return
	 */
	public ResultDto sendVerifyCodeSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("发送短信验证码");
		String mobile = data.getMobileno();
		String code = (int)((Math.random() * 9 + 1) * 100000) + "";
		String mobile_code = "{\"code\":\"" + code + "\"}";
		AliTools.sendMsg(mobile, mobile_code, Configs.registcode);
		stringRedisTemplate.opsForValue().set(mobile, code);
		return result;
	}

	/**
	 * 用户注册
	 * @param data
	 * @return
	 */
	public ResultDto userRegisterSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("用户注册");
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isNotEmpty(members)) {
			result.setMsg("用户已注册");
			result.setCode("1");
			return result;
		}
		String code = stringRedisTemplate.opsForValue().get(data.getMobileno());
		if (code == null) {
			code = "";
		}
		if (data.getVerifyCode().equals(code)) {
			Member member = new Member();
			member.setMobileno(data.getMobileno());
			member.setLoginpsw(data.getLoginPwd());
			member.setInvitecode(data.getInviteCode());
			memberMapper.insertSelective(member);
			result.setMsg("注册成功");
		} else {
			result.setMsg("验证码错误，请重新输入");
			result.setCode("2");
		}
		return result;
	}

	/**
	 * 用户登录
	 * @param data
	 * @return
	 */
	public ResultDto userLoginSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("用户登录");
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isNotEmpty(members)) {
			Member member = members.get(0);
			if (data.getLoginPwd().equals(member.getLoginpsw())) {
				result.setMsg("登录成功");
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
	 * @param data
	 * @return
	 */
	public ResultDto updateLoginPwdSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("修改登录密码");
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isEmpty(members)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		Member memberInfo = members.get(0);
		if (data.getNewLoginPwd().equals(memberInfo.getTradingpsw())) {
			result.setMsg("新的登录密码不能与交易密码相同");
			result.setCode("2");
			return result;
		}
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
				String code = stringRedisTemplate.opsForValue().get(data.getMobileno());
				if (code == null) {
					code = "";
				}
				if (data.getVerifyCode().equals(code)) {
					memberMapper.updateByPrimaryKeySelective(memdto);
					result.setMsg("忘记密码修改成功");
				} else {
					result.setMsg("验证码错误，请重新输入");
					result.setCode("3");
				}
				break;
			case 1:
				if (data.getLoginPwd().equals(memberInfo.getLoginpsw())) {
					memberMapper.updateByPrimaryKeySelective(memdto);
					result.setMsg("密码修改成功");
				} else {
					result.setMsg("原密码输入错误");
					result.setCode("4");
				}
				break;
		}
		return result;
	}

	/**
	 * 设置交易密码
	 * @param data
	 * @return
	 */
	public ResultDto setTransactionPwdSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("设置交易密码");
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isEmpty(members)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		Member memberInfo = members.get(0);
		if (data.getLoginPwd().equals(memberInfo.getLoginpsw())) {
			if (data.getTransactionPwd().equals(data.getLoginPwd())) {
				result.setMsg("交易密码不能与登录密码相同");
				result.setCode("2");
			} else {
				Member memdto = new Member();
				memdto.setMemid(memberInfo.getMemid());
				memdto.setTradingpsw(data.getTransactionPwd());
				memberMapper.updateByPrimaryKeySelective(memdto);
				result.setMsg("交易密码设置成功");
			}
		} else {
			result.setMsg("登录密码错误");
			result.setCode("3");
		}
		return result;
	}

	/**
	 * 修改交易密码
	 * @param data
	 * @return
	 */
	public ResultDto updateTransactionPwdSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("修改交易密码");
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isEmpty(members)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		Member memberInfo = members.get(0);
		if (data.getTransactionPwd().equals(memberInfo.getTradingpsw())) {
			if (data.getTransactionPwd().equals(data.getLoginPwd())) {
				result.setMsg("新的交易密码不能与登录密码相同");
				result.setCode("2");
			} else {
				Member memdto = new Member();
				memdto.setMemid(memberInfo.getMemid());
				memdto.setTradingpsw(data.getNewTransactionPwd());
				memberMapper.updateByPrimaryKeySelective(memdto);
				result.setMsg("交易密码修改成功");
			}
		} else {
			result.setMsg("原交易密码错误");
			result.setCode("3");
		}
		return result;
	}

	/**
	 * 忘记交易密码
	 * @param data
	 * @return
	 */
	public ResultDto forgetTransactionPwdSer(MemberDto data) {
		ResultDto result = new ResultDto();
		result.setMsg("忘记交易密码");
		List<Member> members = memberMapper.selectByCriteria(Criteria.create(Member.class)
				.add(ExpressionFactory.eq("mobileno", data.getMobileno())));
		if (CollectionUtils.isEmpty(members)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		Member memberInfo = members.get(0);
		switch (data.getNextStep()) {
			case 0:
				if (!data.getRealName().equals(memberInfo.getRealname()) ||
						!data.getIdCard().equals(memberInfo.getIdcardno()) ||
								!data.getLoginPwd().equals(memberInfo.getLoginpsw())) {
					result.setMsg("用户验证信息有误");
					result.setCode("2");
					return result;
				}
				break;
			case 1:
				if (data.getNewTransactionPwd().equals(memberInfo.getLoginpsw())) {
					result.setMsg("新的交易密码不能与登录密码相同");
					result.setCode("3");
					return result;
				}
				Member memdto = new Member();
				memdto.setMemid(memberInfo.getMemid());
				memdto.setTradingpsw(data.getNewTransactionPwd());
				memberMapper.updateByPrimaryKeySelective(memdto);
				result.setMsg("交易密码修改成功");
				break;
		}
		return result;
	}


}