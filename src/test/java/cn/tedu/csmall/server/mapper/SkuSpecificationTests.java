package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Sku;
import cn.tedu.csmall.server.pojo.entity.SkuSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SkuSpecificationTests {

    @Autowired
    SkuSpecificationMapper mapper;

    @Test
    public void testInsert() {
        SkuSpecification skuSpecification = new SkuSpecification();
        skuSpecification.setId(1L);
        skuSpecification.setAttributeName("测试");
        System.out.println("测试添加之前"+skuSpecification);
        int rows = mapper.insert(skuSpecification);
        System.out.println("rows="+rows);
        System.out.println("测试添加之后"+skuSpecification);
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
        int rows = mapper.updateNameById(id);
        System.out.println("修改完成受影响行数"+rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(2L, 3L, 5L, 7L, 9L);
        System.out.println("批量删除完成，受影响的行数=" + rows);
    }
}
