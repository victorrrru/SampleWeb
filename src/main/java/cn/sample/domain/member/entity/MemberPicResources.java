package cn.sample.domain.member.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MemberPicResources implements Serializable {
    /**
     * 主键id
     */
    private Integer memresid;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 图片类型（0头像1身份证正面2身份证反面3人脸识别4身份证头像,5驾驶证正面6行驶证正面7行驶证反面8驾驶证背面）
     */
    private Short pictype;

    /**
     * 图片路径
     */
    private String url;

    /**
     * 图片来源类型0默认会员1贷款的图片2信用申请的图片
     */
    private Byte objectType;

    /**
     * 贷款id,信用申请id
     */
    private Integer objectId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 修改时间
     */
    private Date modifiedon;

    private static final long serialVersionUID = 1L;

    public Integer getMemresid() {
        return memresid;
    }

    public void setMemresid(Integer memresid) {
        this.memresid = memresid;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Short getPictype() {
        return pictype;
    }

    public void setPictype(Short pictype) {
        this.pictype = pictype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Byte getObjectType() {
        return objectType;
    }

    public void setObjectType(Byte objectType) {
        this.objectType = objectType;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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