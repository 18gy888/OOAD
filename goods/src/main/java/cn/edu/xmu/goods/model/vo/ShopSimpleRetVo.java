package cn.edu.xmu.goods.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShopSimpleRetVo {
    private Long id;
    private String name;
    private byte state;
}
