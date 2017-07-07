package cn.sample.member.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class BankCard implements Serializable {
    /**
     * 主键id
     */
    private Integer bcid;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 持卡人
     */
    private String cardholder;

    /**
     * 银行卡号
     */
    private String bankcardno;

    /**
     * 收款银行
     */
    private String collectingbank;

    /**
     * 银行预留手机号
     */
    private String reservedmobileno;

    /**
     * 是否设为默认收款银行账户（0：否；1：是）
     */
    private Byte defaultcollectingbank;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否设为首选还款银行账户（0：否；1：是）
     */
    private Byte defaultrefundbank;

    /**
     * 是否是默认收/还款银行（0：否，1是）
     */
    private Byte defaultbank;

    /**
     * 创建（注册）时间
     */
    private Date createdon;

    private static final long serialVersionUID = 1L;

    public Integer getBcid() {
        return bcid;
    }

    public void setBcid(Integer bcid) {
        this.bcid = bcid;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getBankcardno() {
        return bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno;
    }

    public String getCollectingbank() {
        return collectingbank;
    }

    public void setCollectingbank(String collectingbank) {
        this.collectingbank = collectingbank;
    }

    public String getReservedmobileno() {
        return reservedmobileno;
    }

    public void setReservedmobileno(String reservedmobileno) {
        this.reservedmobileno = reservedmobileno;
    }

    public Byte getDefaultcollectingbank() {
        return defaultcollectingbank;
    }

    public void setDefaultcollectingbank(Byte defaultcollectingbank) {
        this.defaultcollectingbank = defaultcollectingbank;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getDefaultrefundbank() {
        return defaultrefundbank;
    }

    public void setDefaultrefundbank(Byte defaultrefundbank) {
        this.defaultrefundbank = defaultrefundbank;
    }

    public Byte getDefaultbank() {
        return defaultbank;
    }

    public void setDefaultbank(Byte defaultbank) {
        this.defaultbank = defaultbank;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}