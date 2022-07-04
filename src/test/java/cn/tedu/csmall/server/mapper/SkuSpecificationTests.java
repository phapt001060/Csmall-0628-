package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Sku;
import cn.tedu.csmall.server.pojo.entity.SkuSpecification;
import cn.tedu.csmall.server.pojo.vo.SkuDetailVO;
import cn.tedu.csmall.server.pojo.vo.SkuListVO;
import cn.tedu.csmall.server.pojo.vo.SkuSpecificationDetailVO;
import cn.tedu.csmall.server.pojo.vo.SkuSpecificationListItemVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class SkuSpecificationTests {

    @Autowired
    SkuSpecificationMapper mapper;

    @Test
    public void testInsert() {
        SkuSpecification skuSpecification = new SkuSpecification();
        skuSpecification.setId(1L);
        skuSpecification.setAttributeName("测试");
        log.info("测试添加之前 {}",skuSpecification);
        int rows = mapper.insert(skuSpecification);
        log.info("rows= {}",rows);
        log.info("测试添加之后 {}",skuSpecification);
    }

    @Test
    public void testDeleteById(){
        Long id = 1L;
        int rows = mapper.deleteById(id);
        log.info("删除完成,收影响行数= {}",rows);
    }

    @Test
    public void testUpdateNameById(){
        Long id = 2L;
        int rows = mapper.updateNameById(id);
        log.info("修改完成受影响行数 {}",rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(2L, 3L, 5L, 7L, 9L);
        log.info("批量删除完成，受影响的行数= {}" , rows);
    }

    @Test
    public void testCount(){
        int count =  mapper.count();
        log.info("查询结果 {}",count);
    }


    @Test
    public void testSelect(){
        Long id = 6L;
        SkuSpecificationDetailVO skuSpecificationDetailVo = mapper.getById(id);
        log.info("根据id="+id+"查询完成:"+skuSpecificationDetailVo);
    }

    @Test
    public void testList() {
        List<SkuSpecificationListItemVO> list = mapper.list();
        log.info("查询列表完成，结果集中的数据的数量=" + list.size());
        for (SkuSpecificationListItemVO item : list) {
            log.info("{}",item);
        }
    }
}
