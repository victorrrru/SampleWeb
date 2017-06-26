package cn.sample.loan.web;

import cn.itht.dto.ResultDto;
import cn.sample.loan.service.CreditApplyService;
import cn.sample.loan.web.bo.CreditApplyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Spring MVC Controler - 表：credit_apply
 * @since 2017-06-23 10:44:54
 */
@RestController
@RequestMapping(value = "/noauthor")
public class CreditApplyAction {

	@Autowired
	private CreditApplyService creditApplyService;

	@RequestMapping(value = "/credit/idCard",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public ResponseEntity<ResultDto> idCard(@RequestBody CreditApplyDto applyDto) {
		return new ResponseEntity<ResultDto>(creditApplyService.creditIdCard(applyDto), HttpStatus.OK);
	}

}