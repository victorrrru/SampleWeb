package cn.sample.loan.web.bo;

/**
 * Created by victorrrr on 2017/6/23.
 */
public class CreditApplyDto {

    /**
     * 身份证正面
     */
    private String front;
    /**
     * 身份证反面
     */
    private String back;
    /**
     * 身份证头像
     */
    private String face;
    /**
     * 用户id
     */
    private Integer memId;

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

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }
}
