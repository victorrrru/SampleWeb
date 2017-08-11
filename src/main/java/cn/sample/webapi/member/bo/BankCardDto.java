package cn.sample.webapi.member.bo;

import lombok.Data;

/**
 * Created by victorrrr on 2017/6/28.
 */
@Data
public class BankCardDto {
    /**
     * 用户id
     */
    private Integer memberId;
    /**
     * 持卡人
     */
    private String cardholder;
    /**
     * 收款银行
     */
    private String collectionBank;
    /**
     * 银行预留手机号
     */
    private String mobileno;
    /**
     * 银行卡号
     */
    private String bankCardno;

}
