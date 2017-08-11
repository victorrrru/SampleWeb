package cn.sample.webapi.loan.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by victorrrr on 2017/6/29.
 */
@Data
public class CreditApplyDrivingDto {

    @NotNull(message = "正面照不能为空")
    private String dfront = null;

    private String dback = null;

    @NotNull(message = "行驶证正面照不能为空")
    private String cfront = null;

    @NotNull(message = "行驶证背面照不能为空")
    private String cback = null;

    @NotNull(message = "会员id不能为空")
    private Integer memId = null;

    @NotNull(message = "授信id不能为空")
    private Integer creditApplyId;

    /** car_number -- 车牌号 */
    private String carNumber;

    /** car_brand -- 车辆品牌 */
    private String carBrand;

    /** car_lisence -- 驾照登记地址 */
    private String carLisence;

    /** car_property -- 车辆性质（非运营0运营1） */
    private Byte carProperty;

    /** car_driven -- 驾龄 */
    private Byte carDriven;

    /** car_owner -- 车辆所有人 */
    private String carOwner;

    /** car_code -- 车辆识别代码 */
    private String carCode;

    /** buy_date -- 购买日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date buyDate;

    /** counts -- 第几辆车（0第一辆，1第二辆，2第三辆，3第四辆及以上） */
    private Short counts;

    /** price -- 购买价格 */
    private BigDecimal price;

    /** car_insurance_amount -- 保费金额 */
    private BigDecimal carInsuranceAmount;

}
