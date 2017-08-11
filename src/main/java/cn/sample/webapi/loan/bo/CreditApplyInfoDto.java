package cn.sample.webapi.loan.bo;

import lombok.Data;

/**
 * Created by victorrrr
 * Date : 2017/7/4 13:51
 */
@Data
public class CreditApplyInfoDto {

    private Integer memberId;

    private Byte applyStep;

    private Byte applyState;

    private String front;

    private String back;

}
