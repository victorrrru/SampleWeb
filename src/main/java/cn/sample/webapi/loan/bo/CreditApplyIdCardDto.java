package cn.sample.webapi.loan.bo;

/**
 * Created by victorrrr on 2017/6/23.
 */
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

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}
