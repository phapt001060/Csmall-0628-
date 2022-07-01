package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Sku;
import cn.tedu.csmall.server.pojo.entity.Spu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SkuMapperTests {

    @Autowired
    SkuMapper mapper;

    @Test
    public void testInsert() {
        Sku sku = new Sku();
        sku.setId(1L);
        sku.setTitle("测试");
        System.out.println("测试添加之前"+sku);
        int rows = mapper.insert(sku);
        System.out.println("rows="+rows);
        System.out.println("测试添加之后"+sku);
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
