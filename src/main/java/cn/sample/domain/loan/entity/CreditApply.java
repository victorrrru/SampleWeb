package cn.sample.domain.loan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class CreditApply implements Serializable {
    /**
     * id 主键
     */
    private Integer caId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户id
     */
    private Integer memberId;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 配偶身份证号码
     */
    private String coupleCard;

    /**
     * 配偶手机号码
     */
    private String coupleMobile;

    /**
     * 配偶姓名
     */
    private String coupleName;

    /**
     * 配偶文化程度(0其他1高中及以下2大专3本科4硕士5博士)
     */
    private Byte coupleEducation;

    /**
     * 配偶职业(0照顾孩子，1工作，2个体户，3务农)
     */
    private Byte coupleJob;

    /**
     * 性别0男1女
     */
    private Byte sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 0城镇户口1农村户口
     */
    private Byte originType;

    /**
     * 居住地址省份
     */
    private String domicileProvince;

    /**
     * 居住地址
     */
    private String domicileDetail;

    /**
     * 居住时间
     */
    private Byte domicileTime;

    /**
     * 民族
     */
    private String nation;

    /**
     * 文化程度(0其他1高中及以下2大专3本科4硕士5博士)
     */
    private Byte education;

    /**
     * 最高教育开始时间
     */
    private Date highEduStarttime;

    /**
     * 最高教育结束时间
     */
    private Date highEduEndtime;

    /**
     * 单位名称
     */
    private String companyName;

    /**
     * 公司经营时长（年）
     */
    private Short comBusTimeLength;

    /**
     * 是否是500强0否1是
     */
    private Byte isCompanyFivehun;

    /**
     * 是否允许读取通讯录0否1是
     */
    private Byte isAllowContact;

    /**
     * 是否允许读取通话记录0否1是
     */
    private Byte isAllowRecord;

    /**
     * 允许读取短信0否1是
     */
    private Byte isAllowMessage;

    /**
     * 允许读取定位0否1是
     */
    private Byte isAllowLocation;

    /**
     * 职务（0普通员工，1基层管理，2中层管理，3高层管理）
     */
    private Byte job;

    /**
     * 行业（互联网，教育等）
     */
    private String industry;

    /**
     * 单位地址
     */
    private String workPlace;

    /**
     * 工作经验
     */
    private String workExperience;

    /**
     * 期望额度
     */
    private Integer wantedLimit;

    /**
     * 期望还款期限
     */
    private Byte wantedPeriod;

    /**
     * 期望还款日期
     */
    private Byte wantedRepayDay;

    /**
     * 婚姻状态(0单身，1离异，2丧偶，3已婚)
     */
    private Byte marriage;

    /**
     * 子女个数
     */
    private Byte childAmount;

    /**
     * 家庭人口(0：2人，1：3人，2：4人，3：5人，4：5人以上)
     */
    private Byte familyAmount;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 保险年缴纳费
     */
    private BigDecimal yearPay;

    /**
     * QQ号
     */
    private String qq;

    /**
     * qq年龄
     */
    private Short qqAge;

    /**
     * 微信年龄
     */
    private Short wxAge;

    /**
     * 微信号
     */
    private String wx;

    /**
     * 风控状态0未经过风控评估1已经过风控评估
     */
    private Byte fengkongState;

    /**
     * 审核状态（0填写资料申请中1提交完资料审批中2初审通过3初审不通过4终审通过5终审不通过6自动审批通过7自动审批不通过）
     */
    private Byte applyState;

    /**
     * 申请步骤
     */
    private Byte applyStep;

    private Date createdon;

    /**
     * 备注
     */
    private String remark;

    /**
     * 买房类型0按揭1全款
     */
    private Byte buyType;

    /**
     * 0其他1租房2亲属住房3自建房4商品房
     */
    private Byte houseType;

    /**
     * 住宅类型（0普通住宅，1别墅）
     */
    private Byte houseCaty;

    /**
     * 房子面积
     */
    private Short houseBig;

    /**
     * 每月按揭金额
     */
    private BigDecimal loanAmount;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 所在小区
     */
    private String area;

    /**
     * 每月收入
     */
    private BigDecimal income;

    /**
     * 社保缴纳基数0：5000以下，1：5000-10000，2：10000以上
     */
    private Byte socialSecurity;

    /**
     * 公积金缴纳基数0：5000以下，1：5000-10000，2：10000以上
     */
    private Byte accumulationFund;

    /**
     * 京东白条额度
     */
    private BigDecimal jingdongQuto;

    /**
     * 蚂蚁借呗额度
     */
    private BigDecimal mayijiebQuto;

    /**
     * 蚂蚁花呗额度
     */
    private BigDecimal huabeiQuto;

    /**
     * 负债
     */
    private BigDecimal debit;

    /**
     * 车牌号
     */
    private String carNumber;

    /**
     * 车辆品牌
     */
    private String carBrand;

    /**
     * 驾照登记地址
     */
    private String carLisence;

    /**
     * 车辆性质（非运营0运营1）
     */
    private Byte carProperty;

    /**
     * 驾龄
     */
    private Byte carDriven;

    /**
     * 车辆所有人
     */
    private String carOwner;

    /**
     * 车辆识别代码
     */
    private String carCode;

    /**
     * 购买日期
     */
    private Date buyDate;

    /**
     * 第几辆车（0第一辆，1第二辆，2第三辆，3第四辆及以上）
     */
    private Short counts;

    /**
     * 购买价格
     */
    private BigDecimal price;

    /**
     * 车保费金额
     */
    private BigDecimal carInsuranceAmount;

    /**
     * 户籍地址
     */
    private String address;

    /**
     * 籍贯
     */
    private String nativePlace;

    private static final long serialVersionUID = 1L;

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCoupleCard() {
        return coupleCard;
    }

    public void setCoupleCard(String coupleCard) {
        this.coupleCard = coupleCard;
    }

    public String getCoupleMobile() {
        return coupleMobile;
    }

    public void setCoupleMobile(String coupleMobile) {
        this.coupleMobile = coupleMobile;
    }

    public String getCoupleName() {
        return coupleName;
    }

    public void setCoupleName(String coupleName) {
        this.coupleName = coupleName;
    }

    public Byte getCoupleEducation() {
        return coupleEducation;
    }

    public void setCoupleEducation(Byte coupleEducation) {
        this.coupleEducation = coupleEducation;
    }

    public Byte getCoupleJob() {
        return coupleJob;
    }

    public void setCoupleJob(Byte coupleJob) {
        this.coupleJob = coupleJob;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getOriginType() {
        return originType;
    }

    public void setOriginType(Byte originType) {
        this.originType = originType;
    }

    public String getDomicileProvince() {
        return domicileProvince;
    }

    public void setDomicileProvince(String domicileProvince) {
        this.domicileProvince = domicileProvince;
    }

    public String getDomicileDetail() {
        return domicileDetail;
    }

    public void setDomicileDetail(String domicileDetail) {
        this.domicileDetail = domicileDetail;
    }

    public Byte getDomicileTime() {
        return domicileTime;
    }

    public void setDomicileTime(Byte domicileTime) {
        this.domicileTime = domicileTime;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Byte getEducation() {
        return education;
    }

    public void setEducation(Byte education) {
        this.education = education;
    }

    public Date getHighEduStarttime() {
        return highEduStarttime;
    }

    public void setHighEduStarttime(Date highEduStarttime) {
        this.highEduStarttime = highEduStarttime;
    }

    public Date getHighEduEndtime() {
        return highEduEndtime;
    }

    public void setHighEduEndtime(Date highEduEndtime) {
        this.highEduEndtime = highEduEndtime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Short getComBusTimeLength() {
        return comBusTimeLength;
    }

    public void setComBusTimeLength(Short comBusTimeLength) {
        this.comBusTimeLength = comBusTimeLength;
    }

    public Byte getIsCompanyFivehun() {
        return isCompanyFivehun;
    }

    public void setIsCompanyFivehun(Byte isCompanyFivehun) {
        this.isCompanyFivehun = isCompanyFivehun;
    }

    public Byte getIsAllowContact() {
        return isAllowContact;
    }

    public void setIsAllowContact(Byte isAllowContact) {
        this.isAllowContact = isAllowContact;
    }

    public Byte getIsAllowRecord() {
        return isAllowRecord;
    }

    public void setIsAllowRecord(Byte isAllowRecord) {
        this.isAllowRecord = isAllowRecord;
    }

    public Byte getIsAllowMessage() {
        return isAllowMessage;
    }

    public void setIsAllowMessage(Byte isAllowMessage) {
        this.isAllowMessage = isAllowMessage;
    }

    public Byte getIsAllowLocation() {
        return isAllowLocation;
    }

    public void setIsAllowLocation(Byte isAllowLocation) {
        this.isAllowLocation = isAllowLocation;
    }

    public Byte getJob() {
        return job;
    }

    public void setJob(Byte job) {
        this.job = job;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public Integer getWantedLimit() {
        return wantedLimit;
    }

    public void setWantedLimit(Integer wantedLimit) {
        this.wantedLimit = wantedLimit;
    }

    public Byte getWantedPeriod() {
        return wantedPeriod;
    }

    public void setWantedPeriod(Byte wantedPeriod) {
        this.wantedPeriod = wantedPeriod;
    }

    public Byte getWantedRepayDay() {
        return wantedRepayDay;
    }

    public void setWantedRepayDay(Byte wantedRepayDay) {
        this.wantedRepayDay = wantedRepayDay;
    }

    public Byte getMarriage() {
        return marriage;
    }

    public void setMarriage(Byte marriage) {
        this.marriage = marriage;
    }

    public Byte getChildAmount() {
        return childAmount;
    }

    public void setChildAmount(Byte childAmount) {
        this.childAmount = childAmount;
    }

    public Byte getFamilyAmount() {
        return familyAmount;
    }

    public void setFamilyAmount(Byte familyAmount) {
        this.familyAmount = familyAmount;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public BigDecimal getYearPay() {
        return yearPay;
    }

    public void setYearPay(BigDecimal yearPay) {
        this.yearPay = yearPay;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Short getQqAge() {
        return qqAge;
    }

    public void setQqAge(Short qqAge) {
        this.qqAge = qqAge;
    }

    public Short getWxAge() {
        return wxAge;
    }

    public void setWxAge(Short wxAge) {
        this.wxAge = wxAge;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public Byte getFengkongState() {
        return fengkongState;
    }

    public void setFengkongState(Byte fengkongState) {
        this.fengkongState = fengkongState;
    }

    public Byte getApplyState() {
        return applyState;
    }

    public void setApplyState(Byte applyState) {
        this.applyState = applyState;
    }

    public Byte getApplyStep() {
        return applyStep;
    }

    public void setApplyStep(Byte applyStep) {
        this.applyStep = applyStep;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getBuyType() {
        return buyType;
    }

    public void setBuyType(Byte buyType) {
        this.buyType = buyType;
    }

    public Byte getHouseType() {
        return houseType;
    }

    public void setHouseType(Byte houseType) {
        this.houseType = houseType;
    }

    public Byte getHouseCaty() {
        return houseCaty;
    }

    public void setHouseCaty(Byte houseCaty) {
        this.houseCaty = houseCaty;
    }

    public Short getHouseBig() {
        return houseBig;
    }

    public void setHouseBig(Short houseBig) {
        this.houseBig = houseBig;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public Byte getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(Byte socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public Byte getAccumulationFund() {
        return accumulationFund;
    }

    public void setAccumulationFund(Byte accumulationFund) {
        this.accumulationFund = accumulationFund;
    }

    public BigDecimal getJingdongQuto() {
        return jingdongQuto;
    }

    public void setJingdongQuto(BigDecimal jingdongQuto) {
        this.jingdongQuto = jingdongQuto;
    }

    public BigDecimal getMayijiebQuto() {
        return mayijiebQuto;
    }

    public void setMayijiebQuto(BigDecimal mayijiebQuto) {
        this.mayijiebQuto = mayijiebQuto;
    }

    public BigDecimal getHuabeiQuto() {
        return huabeiQuto;
    }

    public void setHuabeiQuto(BigDecimal huabeiQuto) {
        this.huabeiQuto = huabeiQuto;
    }

    public BigDecimal getDebit() {
        return debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarLisence() {
        return carLisence;
    }

    public void setCarLisence(String carLisence) {
        this.carLisence = carLisence;
    }

    public Byte getCarProperty() {
        return carProperty;
    }

    public void setCarProperty(Byte carProperty) {
        this.carProperty = carProperty;
    }

    public Byte getCarDriven() {
        return carDriven;
    }

    public void setCarDriven(Byte carDriven) {
        this.carDriven = carDriven;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Short getCounts() {
        return counts;
    }

    public void setCounts(Short counts) {
        this.counts = counts;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCarInsuranceAmount() {
        return carInsuranceAmount;
    }

    public void setCarInsuranceAmount(BigDecimal carInsuranceAmount) {
        this.carInsuranceAmount = carInsuranceAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
}