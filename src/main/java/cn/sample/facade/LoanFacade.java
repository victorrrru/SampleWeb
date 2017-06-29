package cn.sample.facade;

import cn.itht.dto.ResultDto;
import cn.sample.loan.service.CreditApplyService;
import cn.sample.loan.web.bo.CreditApplyDrivingDto;
import cn.sample.loan.web.bo.CreditApplyIdCardDto;
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

    /**
     * 授信传入身份证
     * @param data
     * @return
     */
    public ResultDto creditIdCard(CreditApplyIdCardDto data) {
        ResultDto result = new ResultDto();
        result.setMsg("授信传入身份证");
        HashMap<String, String> map = creditApplyService.insertIdCardInfo(data);
        memberPicResourcesService.insertIdCard(data, Integer.valueOf(map.get("creditId")));
        result.setData(map);
        return result;
    }

    /**
     * 授信传入驾驶证
     * @param data
     * @return
     */
    public ResultDto creditDriving(CreditApplyDrivingDto data) {
        ResultDto result = new ResultDto();
        result.setMsg("授信传入驾驶证");
        creditApplyService.updateDrivingInfo(data);
        memberPicResourcesService.insertDrivingLisence(data);
        return result;
    }

}
