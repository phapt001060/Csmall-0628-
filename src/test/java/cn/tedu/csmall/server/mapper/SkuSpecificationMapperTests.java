package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.SkuSpecification;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class SkuSpecificationMapperTests {

    @Autowired
    SkuSpecificationMapper mapper;

    @Test
    public void testInsert() {
        SkuSpecification skuSpecification = new SkuSpecification();
        skuSpecification.setSkuId(10000L);
        skuSpecification.setAttributeName("颜色");
        skuSpecification.setAttributeValue("黑色");

        log.debug("插入数据之前，参数={}", skuSpecification);
        int rows = mapper.insert(skuSpecification);
        log.debug("rows = {}", rows);
        log.debug("插入数据之后，参数={}", skuSpecification);
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

}