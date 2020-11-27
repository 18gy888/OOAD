package cn.edu.xmu.goods.model.vo;

import cn.edu.xmu.goods.model.po.CouponActivityPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel(value = "优惠活动")
public class CouponActivityVo {

    @ApiModelProperty(value = "优惠名称")
    String name;

    @ApiModelProperty(value = "优惠券数目，0表示不限量")
    Integer quantity;

    @ApiModelProperty(value = "0表会每人数量，1表示总数控制")
    Byte quantityType;

    @ApiModelProperty(value = "优惠券时长，0表示与活动相同，否则表示自领取后几日内有效")
    Byte validTerm;

    @ApiModelProperty(value = "开始领优惠券时间")
    LocalDateTime couponTime;

    @ApiModelProperty(value = "活动开始时间")
    LocalDateTime beginTime;

    @ApiModelProperty(value = "活动结束时间")
    LocalDateTime endTime;

    @ApiModelProperty(value = "优惠规则")
    String strategy;

    public CouponActivityPo createPo() {
        CouponActivityPo po = new CouponActivityPo();
        po.setName(name);
        po.setQuantity(quantity);
        po.setQuantitiyType(quantityType);
        po.setValidTerm(validTerm);
        po.setCouponTime(couponTime);
        po.setBeginTime(beginTime);
        po.setEndTime(endTime);
        po.setStrategy(strategy);
        return po;
    }
}