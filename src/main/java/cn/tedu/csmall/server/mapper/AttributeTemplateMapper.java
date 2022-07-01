package cn.tedu.csmall.server.mapper;
import cn.tedu.csmall.server.pojo.entity.AttributeTemplate;

public interface AttributeTemplateMapper {
    /**
     *
     * @param attributeTemplate
     * @return
     */
    int insertAttributeTemplate(AttributeTemplate attributeTemplate);
    /**
     *
     * @param attributeTemplate
     * @return
     */
    int deleteAttributeTemplateById(AttributeTemplate attributeTemplate);
}
