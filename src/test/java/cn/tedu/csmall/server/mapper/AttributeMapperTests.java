package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.entity.Attribute;
import cn.tedu.csmall.server.pojo.entity.AttributeTemplate;
import cn.tedu.csmall.server.pojo.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class AttributeMapperTests {
    @Autowired
    AttributeMapper mapper;

    @Test
    public void testInsert(){
        Attribute attribute = new Attribute();
        attribute.setName("图片");
        log.info("测试添加之间 {}",attribute);
        int rows = mapper.insert(attribute);
        log.info("rows= {}",rows);
        log.info("测试添加之后 {}",attribute);
    }

    @Test
    public void testDeleteById(){
        Long id = 1L;
        int rows = mapper.deleteById(id);
        log.info("删除完成,收影响行数{}",rows);
    }

    @Test
    public void testUpdateNameById(){
        Long id = 2L;
        String name = "123";
        int rows = mapper.updateNameById(id,name);
        log.info("修改完成受影响行数 {}",rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(2L, 3L, 5L, 7L, 9L);
        log.info("批量删除完成，受影响的行数{}" ,rows);
    }

    @Test
    public void testCount(){
        int count =  mapper.count();
        log.info("查询结果 {}",count);
    }

    @Test
    public void testSelect(){
        Long id = 3L;
        AttributeDetailVO attributeDetailVO = mapper.getById(id);
        log.info("根据id{}查询完成: {}",id,attributeDetailVO);
    }

    @Test
    public void testList() {
        List<AttributeListItemVO> list = mapper.list();
        log.info("查询列表完成，结果集中的数据的数量{}" ,list.size());
        for (AttributeListItemVO item : list) {
            log.info("{}",item);
        }
    }
}
