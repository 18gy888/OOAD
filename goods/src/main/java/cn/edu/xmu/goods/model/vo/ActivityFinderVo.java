package cn.edu.xmu.goods.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ActivityFinderVo {
    @ApiModelProperty(value = "商铺ID")
    Long shopId;

    @ApiModelProperty(value = "SPUID")
    Long spuId;

    @ApiModelProperty(value = "页数")
    Integer page;

    @ApiModelProperty(value = "每页数目")
    Integer pageSize;

    @ApiModelProperty(value = "时间线")
    Byte timeline;

    Byte state;

    LocalDateTime beginTime;

    LocalDateTime endTime;
}
