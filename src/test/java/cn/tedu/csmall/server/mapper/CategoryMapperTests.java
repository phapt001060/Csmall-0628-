package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryMapperTests {
    @Autowired
    CategoryMapper mapper;

    @Test
    public void testInsert(){
        Category category = new Category();
        category.setName("图片");
        System.out.println("测试添加之间"+category);
        int rows = mapper.insert(category);
        System.out.println("rows="+rows);
        System.out.println("测试添加之后"+category);
    }

}
