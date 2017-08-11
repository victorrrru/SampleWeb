package cn.sample.webapi.loan.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by victorrrr on 2017/6/29.
 */
@Data
public class CreditApplyPersonalDto {

    private String domicileProvince;
    /**
     * domicile_detail -- 详细地址
     */
    private String domicileDetail;

    /** domicile_time -- 居住时间 */
    private Byte domicileTime;

    /**
     * education -- 文化程度(0高中及以下1中专2大专3本科4硕士5博士)
     */
    private Integer education;

    /**
     * company_name -- 单位名称
     */
    private String companyName;

    /** is_company_fivehun -- 是否是500强0否1是 */
    private Byte isCompanyFivehun;

    /**
     * job -- 职务
     */
    private Byte job;

    /**
     * marriage -- 婚姻状态(0单身，1丧偶，2离异,3已婚)
     */
    private Integer marriage;

    /** couple_card -- 配偶身份证号码 */
    private String coupleCard;

    /** couple_mobile -- 配偶手机号码 */
    private String coupleMobile;

    /** couple_name -- 配偶姓名 */
    private String coupleName;

    /** couple_education -- 配偶文化程度(0高中及以下1中专2大专3本科4硕士5博士) */
    private Byte coupleEducation;

    /** couple_job -- 配偶职业(在家、工作) */
    private Byte coupleJob;

    /** family_amount -- 家庭人口(0：2人，1：3人，2：4人，3：5人，4：5人以上) */
    private Byte familyAmount;

    /** member_id -- 用户id */
    private Integer memberId;
    /** buy_type -- 买房类型0按揭1全款 */
    private Byte buyType;

    /** house_type -- 0商品房1自建房2亲属主住房3租房4其他 */
    private Byte houseType;

    /** origin_type -- 0城镇户口1农村户口 */
    private Byte originType;

    /** house_caty -- 住宅类型（0普通住宅，1别墅） */
    private Byte houseCaty;

    /** house_big -- 房子面积 */
    private Short houseBig;

    /** loan_amount -- 每月按揭金额 */
    private BigDecimal loanAmount;

    /** city -- 所在城市 */
    private String city;

    /** area -- 所在小区 */
    private String area;

    /** income --  */
    @Min(value = 0,message = "月收入不能为0")
    private BigDecimal income;

    /** social_security -- 社保缴纳基数0：5000以下，1：5000-10000，2：10000以上 */
    private Byte socialSecurity;

    /** accumulation_fund -- 公积金缴纳基数0：5000以下，1：5000-10000，2：10000以上 */
    private Byte accumulationFund;

    /** jingdong_quto -- 京东白条额度 */
    private BigDecimal jingdongQuto;

    /** mayijieb_quto -- 蚂蚁借呗额度 */
    private BigDecimal mayijiebQuto;

    /** huabei_quto -- 蚂蚁花呗额度 */
    private BigDecimal huabeiQuto;

    /** debit -- 负债 */
    private BigDecimal debit;

    /** qq -- QQ号 */
    private String qq;

    /** qq_age -- qq年龄 */
    private Short qqAge;

    /** wx_age -- 微信年龄 */
    private Short wxAge;

    /** wx -- 微信号 */
    private String wx;

    /** high_edu_starttime -- 最高教育开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date highEduStarttime;

    /** high_edu_endtime -- 最高教育结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date highEduEndtime;

    /** year_pay -- 保险年缴纳费 */
    private BigDecimal yearPay;

    /** com_bus_time_length -- 公司经营时长（年） */
    private Short comBusTimeLength;

    /** work_experience -- 工作经验 */
    private String workExperience;

    /** work_place -- 单位地址 */
    private String workPlace;

    /** wanted_limit -- 期望额度 */
    private Integer wantedLimit;

    /** wanted_period -- 期望还款期限 */
    private Byte wantedPeriod;

    /** wanted_repay_day -- 期望还款日期 */
    private Byte wantedRepayDay;
}
