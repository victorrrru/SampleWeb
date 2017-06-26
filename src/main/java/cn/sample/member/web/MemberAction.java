package cn.sample.member.web;

import cn.itht.dto.RequestDto;
import cn.itht.dto.ResultDto;
import cn.sample.member.service.MemberService;
import cn.sample.member.web.bo.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Spring MVC Controler - 表：member
 * @since 2017-06-14 14:34:10
 */
@RestController
@RequestMapping(value = "/member")
public class MemberAction {

	@Resource
	private MemberService memberService;

	/**
	 * 检查用户是否注册接口
	 * param：mobileno（电话号码）
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/isRegister",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public ResponseEntity<ResultDto> isRegister(@RequestBody RequestDto<MemberDto> param) {
		return new ResponseEntity<>(memberService.isRegisterSer(param), HttpStatus.OK);
	}

	/**
	 *用户注册接口
	 * param：mobileno
	 * 		loginPwd
	 * 		inviteCode
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public ResponseEntity<ResultDto> userRegister(@RequestBody RequestDto<MemberDto> param) {
		return new ResponseEntity<>(memberService.userRegisterSer(param), HttpStatus.OK);
	}

	/**
	 * 用户登录接口
	 * param：mobileno
	 * 		loginPwd
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/userLogin",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public ResponseEntity<ResultDto> userLogin(@RequestBody RequestDto<MemberDto> param) {
		return new ResponseEntity<>(memberService.userLoginSer(param), HttpStatus.OK);
	}

	/**
	 * 修改密码接口
	 * 场景：忘记密码；修改密码
	 * param：mobileno
	 * 		loginPwd
	 * 		updateLoginPwdType
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/updateLoginPwd",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public ResponseEntity<ResultDto> updateLoginPwd(@RequestBody RequestDto<MemberDto> param) {
		return new ResponseEntity<>(memberService.updateLoginPwdSer(param), HttpStatus.OK);
	}
}