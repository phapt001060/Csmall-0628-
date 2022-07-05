package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 相册详情VO
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class AlbumDetailVO implements Serializable {

    /**
     * 记录id
     */
    private Long id;

    /**
     * 相册名称
     */
    private String name;

    /**
     * 相册简介
     */
    private String description;

    /**
     * 自定义排序序号
     */
    private Integer sort;

}