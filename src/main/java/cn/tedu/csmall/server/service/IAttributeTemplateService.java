package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.pojo.dto.AttributeTemplateAddNewDTO;

/**
 * 属性模板业务接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public interface IAttributeTemplateService {

    /**
     * 创建属性模板
     *
     * @param attributeTemplateAddNewDTO 创建的属性模板
     */
    void addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO);

}
