package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
@Data
public class CategoryAttributeTemplateDetailVO implements Serializable {
    private Long id;
    private Long categoryId;
    private Long attributeTemplateId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
