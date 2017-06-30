package cn.sample.facade;

import cn.itht.dto.ResultDto;
import cn.sample.config.service.CommDataConfigService;
import cn.sample.loan.entity.CreditApply;
import cn.sample.loan.service.CreditApplyService;
import cn.sample.loan.web.bo.CreditApplyDrivingDto;
import cn.sample.loan.web.bo.CreditApplyIdCardDto;
import cn.sample.loan.web.bo.CreditApplyPersonalDto;
import cn.sample.member.entity.Member;
import cn.sample.member.service.MemberPicResourcesService;
import cn.sample.member.service.MemberService;
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
    @Autowired
    private MemberService memberService;
    @Autowired
    private CommDataConfigService commDataConfigService;

    /**
     * 授信传入身份证
     * @param data
     * @return
     */
    public ResultDto creditIdCard(CreditApplyIdCardDto data) {
        ResultDto result = new ResultDto();
        result.setMsg("授信传入身份证");
        CreditApply creditApply = creditApplyService.insertIdCardInfo(data);
        memberService.updateMemIdCardInfo(creditApply);
        memberPicResourcesService.insertIdCard(data, creditApply.getCaId());
        result.setData(creditApply);
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

    /**
     * 授信传入个人信息
     * @param data
     * @return
     */
    public ResultDto creditPersonalInfo(CreditApplyPersonalDto data) {
        ResultDto result = new ResultDto();
        result.setMsg("授信传入个人信息");
        creditApplyService.updatePersonalInfo(data);
        memberService.updateMemInfo(data,commDataConfigService.getEduType(data.getEducation()));
        return result;
    }

    /**
     * 查询授信状态
     * @param memberId
     * @return
     */
    public ResultDto creditApplyStatus(Integer memberId) {
        ResultDto result = new ResultDto();
        result.setMsg("查询授信状态");

        return result;
    }

}
