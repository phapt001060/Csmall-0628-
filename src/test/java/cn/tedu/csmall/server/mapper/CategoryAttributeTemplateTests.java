package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.CategoryAttributeTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryAttributeTemplateTests {
    @Autowired
    CategoryAttributeTemplateMapper mapper;


    @Test
    public void delete(){
        Long id = 1L;
        int rows = mapper.DeleteCategoryAttributeTemplateById(id);
        System.out.println("删除完成,收影响行数="+rows);
    }

}
