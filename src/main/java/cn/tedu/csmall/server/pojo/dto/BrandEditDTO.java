package cn.tedu.csmall.server.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 编辑品牌的DTO类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class BrandEditDTO implements Serializable {

    /**
     * 类别id
     */
    @ApiModelProperty(value = "类别id", required = true, example = "0")
    private Long categoryId;

    /**
     * 品牌名称
     */
    @ApiModelProperty(value = "品牌名称", required = true, example = "华为")
    private String name;

    /**
     * 品牌名称的拼音
     */
    @ApiModelProperty(value = "品牌名称的拼音", required = true, example = "huawei")
    private String pinyin;

    /**
     * 品牌logo的URL
     */
    @ApiModelProperty(value = "品牌logo的URL", example = "http://www.logo.com/huawei.png")
    private String logo;

    /**
     * 品牌简介
     */
    @ApiModelProperty(value = "品牌简介", example = "专注网络技术几十年")
    private String description;

    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    @ApiModelProperty(value = "关键词列表，各关键词使用英文的逗号分隔", example = "华为,Mate,Nova")
    private String keywords;

    /**
     * 自定义排序序号
     */
    @ApiModelProperty(value = "自定义排序序号", example = "98")
    private Integer sort;

}