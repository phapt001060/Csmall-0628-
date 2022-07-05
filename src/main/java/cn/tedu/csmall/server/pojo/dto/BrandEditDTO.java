package cn.tedu.csmall.server.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.Serializable;
import java.util.Objects;
@Data
public class BrandEditDTO implements Serializable {
    @ApiModelProperty(value = "类别名称",required = true)
    private String name;
    @ApiModelProperty("品牌名称的拼音")
    private String pinyin;
    @ApiModelProperty("类别logo的url")
    private String logo;
    @ApiModelProperty("类别ID")
    private Long categoryId;
    @ApiModelProperty("品牌简介")
    private String description;
    @ApiModelProperty(value = "关键词列表,各关键词用逗号分隔",required = true)
    private String keywords;
    @ApiModelProperty(value = "品牌分类",required = true)
    private Integer sort;

}