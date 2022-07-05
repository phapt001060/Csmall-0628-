package cn.tedu.csmall.server.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 模板的属性与值
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class AttributeTemplateValue implements Serializable {

    /**
     * 记录id
     */
    private Long id;

    /**
     * 模板id
     */
    private Long templateId;

    /**
     * 属性id
     */
    private Long attributeId;

    /**
     * 自定义排序序号
     */
    private Integer sort;

    /**
     * 数据创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 数据最后修改时间
     */
    private LocalDateTime gmtModified;

}