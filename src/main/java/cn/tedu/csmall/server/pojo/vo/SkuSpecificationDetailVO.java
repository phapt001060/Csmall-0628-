package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;
@Data
public class SkuSpecificationDetailVO {
    private Long id;
    private Long skuId;
    private Long attributeId;
    private String attributeName;
    private String attributeValue;
    private String unit;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
