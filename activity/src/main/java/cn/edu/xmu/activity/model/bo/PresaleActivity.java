package cn.edu.xmu.activity.model.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Data
public class PresaleActivity {
    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public enum PresaleStatus {
        OFFLINE((byte)0,"已下线"),
        ONLINE((byte)1,"已上线"),
        DELETE((byte)2,"已删除");

        private static final Map<Byte, PresaleStatus> typeMap;
        static { //由类加载机制，静态块初始加载对应的枚举属性到map中，而不用每次取属性时，遍历一次所有枚举值
            typeMap = new HashMap();
            for (PresaleStatus enum1 : values()) {
                typeMap.put(enum1.code, enum1);
            }
        }

        private byte code;
        @JsonProperty("name")
        private String description;

        PresaleStatus(byte code, String description) {
            this.code = code;
            this.description = description;
        }

        public static PresaleStatus getTypeByCode(Integer code) {
            return typeMap.get(code);
        }

        public Byte getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }
    }
    private Long id;
    private String name;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    private LocalDateTime couponTime;
    private PresaleStatus status;
    private Long shopId;
    private Long spuId;
    private Long quantity;
    private Integer advancePayPrice;
    private Integer restPayPrice;

}
