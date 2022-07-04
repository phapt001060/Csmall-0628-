package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Spu;
import cn.tedu.csmall.server.pojo.entity.SpuDetail;
import cn.tedu.csmall.server.pojo.vo.SkuSpecificationDetailVO;
import cn.tedu.csmall.server.pojo.vo.SkuSpecificationListItemVO;
import cn.tedu.csmall.server.pojo.vo.SpuDetailTwoListItemVO;
import cn.tedu.csmall.server.pojo.vo.SpuDetailTwoVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class SpuDetailMapperTests {

    @Autowired
    SpuDetailMapper mapper;

    @Test
    public void testInsert() {
        SpuDetail spuDetail = new SpuDetail();
        spuDetail.setId(1L);
        spuDetail.setSpuId(2L);
        int rows = mapper.insert(spuDetail);
        log.info("rows= {}",rows);
        log.info("测试添加之后 {}",spuDetail);
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
       SpuDetailTwoVO spuDetailTwoVO = mapper.getById(id);
        log.info("根据id="+id+"查询完成:"+ spuDetailTwoVO);
    }

    @Test
    public void testList() {
        List<SpuDetailTwoListItemVO> list = mapper.list();
        log.info("查询列表完成，结果集中的数据的数量=" + list.size());
        for (SpuDetailTwoListItemVO item : list) {
            log.info("{}",item);
        }
    }
}
