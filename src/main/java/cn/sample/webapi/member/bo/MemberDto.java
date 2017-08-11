package cn.sample.webapi.member.bo;

import lombok.Data;

/**
 * Created by victorrrr on 2017/6/22.
 */
@Data
public class MemberDto {
    /**
     * 手机号
     */
    private String mobileno;
    /**
     * 验证码
     */
    private String verifyCode;
    /**
     * 登录密码
     */
    private String loginPwd;
    /**
     * 新密码
     */
    private String newLoginPwd;
    /**
     * 邀请码
     */
    private String inviteCode;
    /**
     * 修改密码类型（0：忘记密码；1：修改密码）
     */
    private Byte updateLoginPwdType;
    /**
     * 交易密码
     */
    private String transactionPwd;
    /**
     * 新交易密码
     */
    private String newTransactionPwd;
    /**
     * 忘记交易密码时下一步操作
     */
    private Byte nextStep;
    /**
     * 用户姓名
     */
    private String realName;
    /**
     * 用户身份证号码
     */
    private String idCard;

}
