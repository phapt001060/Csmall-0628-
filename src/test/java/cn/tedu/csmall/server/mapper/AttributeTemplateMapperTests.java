package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Attribute;
import cn.tedu.csmall.server.pojo.entity.AttributeTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AttributeTemplateMapperTests {
    @Autowired
    AttributeTemplateMapper mapper;

    @Test
    public void testInsert(){
        AttributeTemplate attributeTemplate = new AttributeTemplate();
        attributeTemplate.setName("图片");
        int rows = mapper.insertAttributeTemplate(attributeTemplate);
        System.out.println("rows="+rows);
    }




}
