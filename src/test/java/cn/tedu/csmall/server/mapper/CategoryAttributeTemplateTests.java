package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.pojo.entity.CategoryAttributeTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryAttributeTemplateTests {

    @Autowired
    CategoryAttributeTemplateMapper mapper;

    @Test
    public void testInsert() {
        CategoryAttributeTemplate category = new CategoryAttributeTemplate();
        category.setCategoryId(1L);
        category.setAttributeTemplateId(1L);
        int rows = mapper.insert(category);
        System.out.println("rows="+rows);
        System.out.println("测试添加之后"+category);
    }

    @Test
    public void testDeleteById(){
        Long id = 1L;
        int rows = mapper.deleteById(id);
        System.out.println("删除完成,收影响行数="+rows);
    }

    @Test
    public void testUpdateNameById(){
        Long id = 2L;
        String name = "123";
        int rows = mapper.updateNameById(id,name);
        System.out.println("修改完成受影响行数"+rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(2L, 3L, 5L, 7L, 9L);
        System.out.println("批量删除完成，受影响的行数=" + rows);
    }
}
