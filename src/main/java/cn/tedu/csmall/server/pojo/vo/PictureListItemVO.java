package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class PictureListItemVO implements Serializable {
    private Long id;
    private String albumId;
    private Long url;
    private String description;
    private String width;
    private Integer height;
    private Integer isCover;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;


}
