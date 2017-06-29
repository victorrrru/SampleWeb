package cn.sample.loan.web;

import cn.itht.dto.RequestDto;
import cn.itht.dto.ResultDto;
import cn.sample.facade.LoanFacade;
import cn.sample.loan.service.CreditApplyService;
import cn.sample.loan.web.bo.CreditApplyIdCardDto;
import cn.sample.loan.web.bo.CreditApplyDrivingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Spring MVC Controler - 表：credit_apply
 * @since 2017-06-23 10:44:54
 */
@RestController
@RequestMapping(value = "/noauthor/credit")
public class CreditApplyAction {

	@Autowired
	private LoanFacade loanFacade;
	@Autowired
	private CreditApplyService creditApplyService;

	/**
	 * 场景：授信传入身份证
	 * 征信第一步的步骤：
	 	1：用户上传身份证照片到阿里云（APP）
	 	2：提交阿里云URL 与用户关联（API）
	 	3：调用FACE++证件API 识别身份证信息，并保存，返回成功信息。
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/idCard",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<ResultDto> idCard(@RequestBody RequestDto<CreditApplyIdCardDto> param) {
		return new ResponseEntity<>(loanFacade.creditIdCard(param.getData()), HttpStatus.OK);
	}

	@RequestMapping(value = "/driving",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<ResultDto> driving(@RequestBody RequestDto<CreditApplyDrivingDto> param) {
		return new ResponseEntity<>(loanFacade.creditDriving(param.getData()), HttpStatus.OK);
	}



}