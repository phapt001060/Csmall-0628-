package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.entity.Attribute;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AttributeMapperTests {
    @Autowired
    AttributeMapper mapper;

    @Test
    public void testInsert(){
        Attribute attribute = new Attribute();
        attribute.setName("图片");
        System.out.println("测试添加之间"+attribute);
        int rows = mapper.insert(attribute);
        System.out.println("rows="+rows);
        System.out.println("测试添加之后"+attribute);
    }
}
