package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Sku;
import cn.tedu.csmall.server.pojo.entity.Spu;
import cn.tedu.csmall.server.pojo.vo.PictureDetailVO;
import cn.tedu.csmall.server.pojo.vo.PictureListItemVO;
import cn.tedu.csmall.server.pojo.vo.SkuDetailVO;
import cn.tedu.csmall.server.pojo.vo.SkuListVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class SkuMapperTests {

    @Autowired
    SkuMapper mapper;

    @Test
    public void testInsert() {
        Sku sku = new Sku();
        sku.setId(1L);
        sku.setTitle("测试");
        log.info("测试添加之前 {}",sku);
        int rows = mapper.insert(sku);
        log.info("rows= {}",rows);
        log.info("测试添加之后 {}",sku);
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
       SkuDetailVO skuDetailVO = mapper.getById(id);
        log.info("根据id="+id+"查询完成:"+skuDetailVO);
    }

    @Test
    public void testList() {
        List<SkuListVO> list = mapper.list();
        log.info("查询列表完成，结果集中的数据的数量=" + list.size());
        for (SkuListVO item : list) {
            log.info("{}",item);
        }
    }
}
