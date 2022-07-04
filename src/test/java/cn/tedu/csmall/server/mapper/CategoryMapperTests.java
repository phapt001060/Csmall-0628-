package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.entity.Category;
import cn.tedu.csmall.server.pojo.vo.BrandDetailVo;
import cn.tedu.csmall.server.pojo.vo.BrandListItemVO;
import cn.tedu.csmall.server.pojo.vo.CategoryDetailVO;
import cn.tedu.csmall.server.pojo.vo.CategoryListItemVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    public void testCount(){
        int count =  mapper.count();
        System.out.println("查询结果"+count);
    }




    @Test
    public void testSelect(){
        Long id = 6L;
        CategoryDetailVO category = mapper.getById(id);
        System.out.println("根据id="+id+"查询完成:"+category);
    }

    @Test
    public void testList() {
        List<CategoryListItemVO> list = mapper.list();
        System.out.println("查询列表完成，结果集中的数据的数量=" + list.size());
        for (CategoryListItemVO item : list) {
            System.out.println(item);
        }
    }
}
