package cn.tedu.csmall.server.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建相册的DTO类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class AlbumAddNewDTO implements Serializable {

    /**
     * 相册名称
     */
    private String name;

    /**
     * 相册简介
     */
    private String description;

}
