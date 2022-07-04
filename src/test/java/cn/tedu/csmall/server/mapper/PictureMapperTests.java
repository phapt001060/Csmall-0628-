package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Picture;
import cn.tedu.csmall.server.pojo.vo.CategoryDetailVO;
import cn.tedu.csmall.server.pojo.vo.CategoryListItemVO;
import cn.tedu.csmall.server.pojo.vo.PictureDetailVO;
import cn.tedu.csmall.server.pojo.vo.PictureListItemVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class PictureMapperTests {
    @Autowired
    PictureMapper mapper;

    @Test
    public void testInsert(){
        Picture picture= new Picture();
        picture.setDescription("图片");
        int rows = mapper.insert(picture);
        log.info("rows= {}",rows);
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
        String name = "123";
        int rows = mapper.updateNameById(id,name);
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
        PictureDetailVO pictureDetailVo = mapper.getById(id);
        log.info("根据id="+id+"查询完成:"+pictureDetailVo);
    }

    @Test
    public void testList() {
        List<PictureListItemVO> list = mapper.list();
        log.info("查询列表完成，结果集中的数据的数量=" + list.size());
        for (PictureListItemVO item : list) {
            log.info("{}",item);
        }
    }
}
