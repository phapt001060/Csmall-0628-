package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.SpuDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class SpuDetailMapperTests {

    @Autowired
    SpuDetailMapper mapper;

    @Test
    public void testInsert() {
        SpuDetail spuDetail = new SpuDetail();
        spuDetail.setSpuId(10000L);
        spuDetail.setDetail("这是1号Spu的详情");

        log.debug("插入数据之前，参数={}", spuDetail);
        int rows = mapper.insert(spuDetail);
        log.debug("rows = {}", rows);
        log.debug("插入数据之后，参数={}", spuDetail);
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