package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrandMapperTests {

    @Autowired
    BrandMapper mapper;

    @Test
    public void testInsert() {
        Brand brand = new Brand();
        brand.setName("菠萝");
        mapper.insert(brand);
    }

}
