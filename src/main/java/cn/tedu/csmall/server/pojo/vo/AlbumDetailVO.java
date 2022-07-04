package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.io.Serializable;


@Data
public class AlbumDetailVO implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Integer sort;
}
