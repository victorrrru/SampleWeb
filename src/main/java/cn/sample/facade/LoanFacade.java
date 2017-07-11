package cn.sample.facade;

import cn.itht.dto.ResultDto;
import cn.sample.common.Enum.CreditApplyStepEnum;
import cn.sample.domain.config.service.CommDataConfigService;
import cn.sample.domain.loan.entity.CreditApply;
import cn.sample.domain.loan.service.CreditApplyService;
import cn.sample.webapi.loan.bo.CreditApplyDrivingDto;
import cn.sample.webapi.loan.bo.CreditApplyIdCardDto;
import cn.sample.webapi.loan.bo.CreditApplyInfoDto;
import cn.sample.webapi.loan.bo.CreditApplyPersonalDto;
import cn.sample.domain.member.service.MemberPicResourcesService;
import cn.sample.domain.member.service.MemberService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional
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
    @Transactional
    public ResultDto creditDriving(CreditApplyDrivingDto data) {
        ResultDto result = new ResultDto();
        result.setMsg("授信传入驾驶证");
        memberPicResourcesService.insertDrivingLisence(data);
        creditApplyService.updateDrivingInfo(data);
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
        memberService.updateMemInfo(data,commDataConfigService.getEduType(data.getEducation().shortValue()));
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
        CreditApplyInfoDto creditInfo = new CreditApplyInfoDto();
        List<CreditApply> creditApplies = creditApplyService.findAll(memberId);
        if (CollectionUtils.isEmpty(creditApplies)) {
            creditInfo.setMemberId(memberId);
            creditInfo.setApplyStep((byte)1);
            result.setData(creditInfo);
            return result;
        }
        CreditApply creditApply = creditApplies.get(0);
        if (creditApply.getApplyStep() != CreditApplyStepEnum.ID_CARD.getStep()) {
            memberPicResourcesService.getIdCardPic(memberId);
        }
        if (creditApply.getApplyStep() > CreditApplyStepEnum.FACE.getStep()) {
            memberPicResourcesService.getFacePic(memberId);
        }
        if (creditApply.getApplyStep() > CreditApplyStepEnum.CAR.getStep()) {
            memberPicResourcesService.getDrivingLisencePic(memberId);
        }


        return result;
    }

}
