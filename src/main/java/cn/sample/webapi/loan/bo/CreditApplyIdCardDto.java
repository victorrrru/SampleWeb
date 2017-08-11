package cn.sample.webapi.loan.bo;

import lombok.Data;

/**
 * Created by victorrrr on 2017/6/23.
 */
@Data
public class CreditApplyIdCardDto {

    /**
     * 身份证正面
     */
    private String front;
    /**
     * 身份证反面
     */
    private String back;
    /**
     * 用户id
     */
    private Integer memberId;

}
