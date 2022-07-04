package cn.tedu.csmall.server.pojo.vo;

import lombok.Data;

import java.io.Serializable;


@Data
public class AttributeDetailVO implements Serializable {
    private Long id;
    private Long templateId;
    private String name;
    private String description;
    private Integer type;
    private Integer inputType;
    private Integer valueList;
    private String unit;
    private Integer sort;
    private Integer isAllowCustomize;
}
