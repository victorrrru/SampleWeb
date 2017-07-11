package cn.sample;

import cn.itht.dto.ResultDto;
import cn.sample.domain.config.service.CommDataConfigService;
import cn.sample.domain.member.service.MemberPicResourcesService;
import cn.sample.domain.member.service.MemberService;
import cn.sample.facade.LoanFacade;
import cn.sample.webapi.loan.bo.CreditApplyDrivingDto;
import cn.sample.webapi.member.bo.MemberDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by victorrrr on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class LoanTest {

    @Autowired
    private LoanFacade loanFacade;
    @Autowired
    private MemberService memberService;
    @Autowired
    private CommDataConfigService commDataConfigService;
    @Autowired
    private MemberPicResourcesService memberPicResourcesService;

    @Test
    public void test() {
        CreditApplyDrivingDto data = new CreditApplyDrivingDto();
        data.setCarCode("A66666");
        data.setCounts((short) 1);
        data.setCarOwner("fanwenwu");
        data.setCfront("http://chefeidai.oss-cn-shenzhen.aliyuncs.com/test/3fd8832e-64fe-493a-9508-29a0daa9a286.jpg");
        data.setCback("http://chefeidai.oss-cn-shenzhen.aliyuncs.com/test/0a161174-d8e6-494e-aa72-f4599013b497.jpg");
        data.setMemId(47);
        data.setCreditApplyId(18);
        loanFacade.creditDriving(data);
    }

    @Test
    public void test2() {
        MemberDto data = new MemberDto();
        data.setMobileno("18565754893");
        ResultDto registerSer = memberService.isRegisterSer(data);
        System.out.println(registerSer);
    }

    @Test
    public void test3() {
        String eduType = commDataConfigService.getEduType((short) 2);
        System.out.println(eduType);
    }

    @Transactional
    @Test
    public void test4() {
        MemberDto data = new MemberDto();
        data.setMobileno("110");
        memberService.userRegisterSer(data);
        int i = 1/0;
        CreditApplyDrivingDto data1 = new CreditApplyDrivingDto();
        data1.setCfront("http://chefeidai.oss-cn-shenzhen.aliyuncs.com/test/3fd8832e-64fe-493a-9508-29a0daa9a286.jpg");
        data1.setCback("http://chefeidai.oss-cn-shenzhen.aliyuncs.com/test/0a161174-d8e6-494e-aa72-f4599013b497.jpg");
        data1.setMemId(47);
        data1.setCreditApplyId(18);
        memberPicResourcesService.insertDrivingLisence(data1);
    }
}
