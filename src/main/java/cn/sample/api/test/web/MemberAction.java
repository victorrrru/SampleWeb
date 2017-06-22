package cn.sample.api.test.web;

import cn.itht.dto.RequestDto;
import cn.itht.dto.ResultDto;
import cn.itht.mybatis.criteria.Criteria;
import cn.itht.mybatis.criteria.ExpressionFactory;
import cn.sample.api.test.entity.Member;
import cn.sample.api.test.service.MemberService;
import cn.sample.api.test.web.bo.MemberDto;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Spring MVC Controler - 表：member
 * @since 2017-06-14 14:34:10
 */
@Controller
@RequestMapping(value = "/test")
public class MemberAction {

	@Resource
	private MemberService memberService;

	@RequestMapping(value = "/register",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public ResponseEntity<ResultDto> userRegister(@RequestBody RequestDto<MemberDto> param) {
		return new ResponseEntity<>(memberService.userRegisterSer(param), HttpStatus.OK);
	}
}