package cn.sample.facade;

import cn.itht.dto.ResultDto;
import cn.sample.loan.service.CreditApplyService;
import cn.sample.loan.web.bo.CreditApplyDto;
import cn.sample.member.service.MemberPicResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by victorrrr on 2017/6/26.
 */
@Component
public class LoanFacade {

    @Autowired
    private MemberPicResourcesService memberPicResourcesService;
    @Autowired
    private CreditApplyService creditApplyService;

    public ResultDto creditIdCard(CreditApplyDto applyDto) {
        ResultDto result = new ResultDto();
        result.setMsg("授信传入身份证");
        HashMap<String, String> map = creditApplyService.creditIdCard(applyDto);
        memberPicResourcesService.insertIdCard(applyDto, Integer.valueOf(map.get("creditId")));
        result.setData(map);
        return result;
    }
}
