package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Category;
import cn.tedu.csmall.server.pojo.vo.CategoryDetailVO;
import cn.tedu.csmall.server.pojo.vo.CategoryListItemVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class CategoryMapperTests {

    @Autowired
    CategoryMapper mapper;

    @Test
    public void testInsert() {
        Category category = new Category();
        category.setName("家电");

        log.debug("插入数据之前，参数={}", category);
        int rows = mapper.insert(category);
        log.debug("rows = {}", rows);
        log.debug("插入数据之后，参数={}", category);
    }

    @Test
    public void testDeleteById() {
        Long id = 1L;
        int rows = mapper.deleteById(id);
        log.debug("删除完成，受影响的行数={}", rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(1L, 3L, 5L, 7L, 9L);
        log.debug("批量删除完成，受影响的行数={}", rows);
    }

    @Test
    public void testCount() {
        int count = mapper.count();
        log.info("统计数量完成，统计结果={}", count);
    }

    @Test
    public void testCountByName() {
        String name = "水果";
        int count = mapper.countByName(name);
        log.debug("根据名称【{}】统计类别数量完成，统计结果={}", name, count);
    }

    @Test
    public void testGetById() {
        Long id = 1L;
        CategoryDetailVO category = mapper.getById(id);
        log.info("根据id={}查询完成，查询结果={}", id, category);
    }

    @Test
    public void testList() {
        Long parentId = 0L;
        List<CategoryListItemVO> list = mapper.listByParentId(parentId);
        log.info("查询列表完成，结果集中的数据的数量=" + list.size());
        for (CategoryListItemVO item : list) {
            log.info("{}", item);
        }
    }

}