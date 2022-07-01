package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.entity.BrandCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrandCategoryMapperTests {
    @Autowired
    BrandCategoryMapper mapper;

    @Test
    public void testDelete(){
        Long id = 2L;
        int rows = mapper.deleteBrandCategoryById(id);
        System.out.println("rows="+rows);
    }

}
