package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.io.Serializable;


@Data
public class AlbumListItemVO implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Integer sort;
}
