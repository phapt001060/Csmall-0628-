package cn.tedu.csmall.server.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 创建品牌的DTO类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class BrandAddNewDTO implements Serializable {

    /**
     * 类别id
     */
    @ApiModelProperty(value = "类别id", required = true)
    private Long categoryId;

    /**
     * 品牌名称
     */
    @ApiModelProperty(value = "品牌名称", required = true)
    private String name;

    /**
     * 品牌名称的拼音
     */
    @ApiModelProperty(value = "品牌名称的拼音", required = true)
    private String pinyin;

    /**
     * 品牌logo的URL
     */
    @ApiModelProperty("品牌logo的URL")
    private String logo;

    /**
     * 品牌简介
     */
    @ApiModelProperty("品牌简介")
    private String description;

    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    @ApiModelProperty("关键词列表，各关键词使用英文的逗号分隔")
    private String keywords;

    /**
     * 自定义排序序号
     */
    @ApiModelProperty("自定义排序序号")
    private Integer sort;

}