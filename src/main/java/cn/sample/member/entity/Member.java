package cn.sample.member.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Member implements Serializable {
    /**
     * 主键id
     */
    private Integer memid;

    /**
     * 现金分期信用等级id
     */
    private Short levelId;

    /**
     * PDL信用等级id
     */
    private Short pdlLevelId;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 手机号
     */
    private String mobileno;

    /**
     * 登录密码
     */
    private String loginpsw;

    /**
     * 会员的白骑士openid
     */
    private String bqsOpenId;

    /**
     * 交易密码
     */
    private String tradingpsw;

    /**
     * 邀请注册的邀请码
     */
    private String invitecode;

    /**
     * 我的邀请码
     */
    private String myInvitecode;

    /**
     * 身份证号
     */
    private String idcardno;

    /**
     * 长居城市
     */
    private String longtimecity;

    /**
     * 详细地址
     */
    private String detailaddr;

    /**
     * 文化程度
     */
    private String leveleducation;

    /**
     * 家庭月收入
     */
    private BigDecimal familyincome;

    /**
     * 单位性质
     */
    private String unitnature;

    /**
     * 单位名称
     */
    private String unitname;

    /**
     * 职务
     */
    private String position;

    /**
     * 民族
     */
    private String nation;

    /**
     * 参加工作时间
     */
    private Date havejobtime;

    /**
     * 现单位入职时间
     */
    private Date nowunitinductiontime;

    /**
     * 婚姻状况(0未婚，1已婚未育，2已婚已育3离异)
     */
    private Byte maritalstatus;

    /**
     * 性别0男1女
     */
    private Byte sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 籍贯
     */
    private String originPalce;

    /**
     * 是否禁用0否1是（黑名单）
     */
    private Byte isEnable;

    /**
     * 子女个数
     */
    private Short childrennumber;

    /**
     * 手机品牌
     */
    private String mobilephonebrand;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 备注
     */
    private String remark;

    /**
     * 联系电话
     */
    private String linkphone;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 修改时间
     */
    private Date modifiedon;

    private static final long serialVersionUID = 1L;

    public Integer getMemid() {
        return memid;
    }

    public void setMemid(Integer memid) {
        this.memid = memid;
    }

    public Short getLevelId() {
        return levelId;
    }

    public void setLevelId(Short levelId) {
        this.levelId = levelId;
    }

    public Short getPdlLevelId() {
        return pdlLevelId;
    }

    public void setPdlLevelId(Short pdlLevelId) {
        this.pdlLevelId = pdlLevelId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getLoginpsw() {
        return loginpsw;
    }

    public void setLoginpsw(String loginpsw) {
        this.loginpsw = loginpsw;
    }

    public String getBqsOpenId() {
        return bqsOpenId;
    }

    public void setBqsOpenId(String bqsOpenId) {
        this.bqsOpenId = bqsOpenId;
    }

    public String getTradingpsw() {
        return tradingpsw;
    }

    public void setTradingpsw(String tradingpsw) {
        this.tradingpsw = tradingpsw;
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode;
    }

    public String getMyInvitecode() {
        return myInvitecode;
    }

    public void setMyInvitecode(String myInvitecode) {
        this.myInvitecode = myInvitecode;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getLongtimecity() {
        return longtimecity;
    }

    public void setLongtimecity(String longtimecity) {
        this.longtimecity = longtimecity;
    }

    public String getDetailaddr() {
        return detailaddr;
    }

    public void setDetailaddr(String detailaddr) {
        this.detailaddr = detailaddr;
    }

    public String getLeveleducation() {
        return leveleducation;
    }

    public void setLeveleducation(String leveleducation) {
        this.leveleducation = leveleducation;
    }

    public BigDecimal getFamilyincome() {
        return familyincome;
    }

    public void setFamilyincome(BigDecimal familyincome) {
        this.familyincome = familyincome;
    }

    public String getUnitnature() {
        return unitnature;
    }

    public void setUnitnature(String unitnature) {
        this.unitnature = unitnature;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getHavejobtime() {
        return havejobtime;
    }

    public void setHavejobtime(Date havejobtime) {
        this.havejobtime = havejobtime;
    }

    public Date getNowunitinductiontime() {
        return nowunitinductiontime;
    }

    public void setNowunitinductiontime(Date nowunitinductiontime) {
        this.nowunitinductiontime = nowunitinductiontime;
    }

    public Byte getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(Byte maritalstatus) {
        this.maritalstatus = maritalstatus;
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

    public String getOriginPalce() {
        return originPalce;
    }

    public void setOriginPalce(String originPalce) {
        this.originPalce = originPalce;
    }

    public Byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Byte isEnable) {
        this.isEnable = isEnable;
    }

    public Short getChildrennumber() {
        return childrennumber;
    }

    public void setChildrennumber(Short childrennumber) {
        this.childrennumber = childrennumber;
    }

    public String getMobilephonebrand() {
        return mobilephonebrand;
    }

    public void setMobilephonebrand(String mobilephonebrand) {
        this.mobilephonebrand = mobilephonebrand;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }
}