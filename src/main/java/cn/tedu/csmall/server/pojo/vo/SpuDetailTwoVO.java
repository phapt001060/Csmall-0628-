package cn.tedu.csmall.server.pojo.vo;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;
@Data
public class SpuDetailTwoVO {
    private Long id;
    private Long spuId;
    private String detail;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;


}
