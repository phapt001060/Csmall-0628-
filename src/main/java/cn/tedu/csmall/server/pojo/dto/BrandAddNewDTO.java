package cn.tedu.csmall.server.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class BrandAddNewDTO implements Serializable {
    @ApiModelProperty(value = "品牌名称",required = true)
    private String name;
    @ApiModelProperty("品牌名称的拼音")
    private String pinyin;
    @ApiModelProperty(value = "品牌logo的URL",required = true)
    private String logo;
    @ApiModelProperty(value = "类别ID",required = true)
    private Long categoryId;
    @ApiModelProperty(value = "品牌简介",required = true)
    private String description;
    @ApiModelProperty(value = "关键词列表,各关键词用逗号分隔",required = true)
    private String keywords;
    @ApiModelProperty("品牌分类")
    private Integer sort;

}