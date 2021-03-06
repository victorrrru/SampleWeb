package cn.sample.domain.member.service;

import cn.itht.dto.ResultDto;
import cn.sample.domain.loan.entity.CreditApply;
import cn.sample.webapi.loan.bo.CreditApplyPersonalDto;
import cn.sample.domain.member.entity.Member;
import cn.sample.domain.member.entity.MemberExample;
import cn.sample.domain.member.mapper.MemberMapper;
import cn.sample.webapi.member.bo.MemberDto;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

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
		MemberExample example = new MemberExample();
		example.createCriteria().andMobilenoEqualTo(data.getMobileno());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(memberList)) {
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
//		String code = new Random().nextInt(1000000) + "";
		String code = (int)((Math.random() * 9 + 1) * 100000) + "";
		String mobile_code = "{\"code\":\"" + code + "\"}";
		//AliTools.sendMsg(data.getMobileno(), mobile_code, Configs.registcode);
		stringRedisTemplate.opsForValue().set(data.getMobileno(), code);
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
		MemberExample example = new MemberExample();
		example.createCriteria().andMobilenoEqualTo(data.getMobileno());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(memberList)) {
			result.setMsg("用户已注册");
			result.setCode("1");
			return result;
		}
//		String code = stringRedisTemplate.opsForValue().get(data.getMobileno());
//		if (code == null) {
//			code = "";
//		}
//		if (data.getVerifyCode().equals(code)) {
			Member member = new Member();
			member.setMobileno(data.getMobileno());
			member.setLoginpsw(data.getLoginPwd());
			member.setInvitecode(data.getInviteCode());
			memberMapper.insertSelective(member);
			result.setMsg("注册成功");
//		} else {
//			result.setMsg("验证码错误，请重新输入");
//			result.setCode("2");
//		}
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
		MemberExample example = new MemberExample();
		example.createCriteria().andMobilenoEqualTo(data.getMobileno());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(memberList)) {
			if (data.getLoginPwd().equals(memberList.get(0).getLoginpsw())) {
				result.setMsg("登录成功");
				result.setData(memberList.get(0));
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
		MemberExample example = new MemberExample();
		example.createCriteria().andMobilenoEqualTo(data.getMobileno());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(memberList)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		if (data.getNewLoginPwd().equals(memberList.get(0).getTradingpsw())) {
			result.setMsg("新的登录密码不能与交易密码相同");
			result.setCode("2");
			return result;
		}
		Member memdto = new Member();
		memdto.setMemid(memberList.get(0).getMemid());
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
				if (data.getLoginPwd().equals(memberList.get(0).getLoginpsw())) {
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
		MemberExample example = new MemberExample();
		example.createCriteria().andMobilenoEqualTo(data.getMobileno());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(memberList)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		if (data.getLoginPwd().equals(memberList.get(0).getLoginpsw())) {
			if (data.getTransactionPwd().equals(data.getLoginPwd())) {
				result.setMsg("交易密码不能与登录密码相同");
				result.setCode("2");
			} else {
				Member memdto = new Member();
				memdto.setMemid(memberList.get(0).getMemid());
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
		MemberExample example = new MemberExample();
		example.createCriteria().andMobilenoEqualTo(data.getMobileno());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(memberList)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		if (data.getTransactionPwd().equals(memberList.get(0).getTradingpsw())) {
			if (data.getTransactionPwd().equals(data.getLoginPwd())) {
				result.setMsg("新的交易密码不能与登录密码相同");
				result.setCode("2");
			} else {
				Member memdto = new Member();
				memdto.setMemid(memberList.get(0).getMemid());
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
		MemberExample example = new MemberExample();
		example.createCriteria().andMobilenoEqualTo(data.getMobileno());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(memberList)) {
			result.setMsg("用户不存在");
			result.setCode("1");
			return result;
		}
		switch (data.getNextStep()) {
			case 0:
				if (!data.getRealName().equals(memberList.get(0).getRealname()) ||
						!data.getIdCard().equals(memberList.get(0).getIdcardno()) ||
								!data.getLoginPwd().equals(memberList.get(0).getLoginpsw())) {
					result.setMsg("用户验证信息有误");
					result.setCode("2");
					return result;
				}
				break;
			case 1:
				if (data.getNewTransactionPwd().equals(memberList.get(0).getLoginpsw())) {
					result.setMsg("新的交易密码不能与登录密码相同");
					result.setCode("3");
					return result;
				}
				Member memdto = new Member();
				memdto.setMemid(memberList.get(0).getMemid());
				memdto.setTradingpsw(data.getNewTransactionPwd());
				memberMapper.updateByPrimaryKeySelective(memdto);
				result.setMsg("交易密码修改成功");
				break;
		}
		return result;
	}

	/**
	 * 上传身份证时把数据存入member表
	 * @param creditApply
	 */
	public void updateMemIdCardInfo(CreditApply creditApply){
		MemberExample example = new MemberExample();
		example.createCriteria().andMemidEqualTo(creditApply.getMemberId());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(memberList)) {
			Member member = memberList.get(0);
			member.setRealname(creditApply.getName());
			member.setIdcardno(creditApply.getIdCard());
			member.setSex(creditApply.getSex());
			member.setNation(creditApply.getNation());
			member.setBirthday(creditApply.getBirthday());
			member.setOriginPalce(creditApply.getAddress());
			memberMapper.updateByPrimaryKeySelective(member);
		}
	}

	/**
	 * 上传个人信息时把数据存入member表
	 * @param data
	 * @param education
	 */
	public void updateMemInfo(CreditApplyPersonalDto data,String education) {
		MemberExample example = new MemberExample();
		example.createCriteria().andMemidEqualTo(data.getMemberId());
		List<Member> memberList = memberMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(memberList)) {
			Member member = memberList.get(0);
			member.setLeveleducation(education);
			member.setUnitname(data.getCompanyName());
			member.setMaritalstatus(data.getMarriage().byteValue());
			memberMapper.updateByPrimaryKeySelective(member);
		}

	}


}