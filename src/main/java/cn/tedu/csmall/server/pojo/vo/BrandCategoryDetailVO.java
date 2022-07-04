package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
@Data
public class BrandCategoryDetailVO implements Serializable {
    private Long id;
    private Long brandId;
    private Long categoryId;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}