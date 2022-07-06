package cn.tedu.csmall.server.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value = "相册名称", required = true, example = "华为Mate40的相册")
    private String name;

    /**
     * 相册简介
     */
    @ApiModelProperty(value = "相册简介", example = "这是华为Mate40的相册，只用于存储此系列手机的照片")
    private String description;

}
