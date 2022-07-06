package cn.tedu.csmall.server.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 创建属性模板DTO
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class AttributeTemplateAddNewDTO implements Serializable {

    /**
     * 属性模板名称
     */
    @ApiModelProperty(value = "属性模板", required = true, example = "华为Mate40的属性模板")
    private String name;

    /**
     * 属性模板名称的拼音
     */
    @ApiModelProperty(value = "属性模板名称的拼音", required = true, example = "huaweimate40")
    private String pinyin;

    /**
     * 关键词列表，各关键词使用英文的逗号分隔
     */
    @ApiModelProperty(value = "关键词列表，各关键词使用英文的逗号分隔", required = true, example = "华为,Mate40")
    private String keywords;

    /**
     * 自定义排序序号
     */
    @ApiModelProperty(value = "自定义排序序号", example = "80")
    private Integer sort;

}