package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.vo.AlbumDetailVO;
import cn.tedu.csmall.server.pojo.vo.AlbumListItemVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class AlbumMapperTests {
    @Autowired
    AlbumMapper mapper;

    @Test
    public void testInsert(){
        Album album = new Album();
        album.setName("图片");
        log.info("测试添加之间 {}",album);
        int rows = mapper.insert(album);
        log.info("rows={}",rows);
        log.info("测试添加之后 {}",album);
    }

    @Test
    public void testUpdateNameById(){
        Long id = 3L;
        String name = "猪哥哥";
        int rows = mapper.updateNameById(id,name);
        log.info("修改完成 {}",rows);
    }

    @Test
    public void testDeleteById(){
        Long id = 1L;
        int rows = mapper.deleteById(id);
        log.info("删除完成,收影响行数 {}",rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(2L, 3L, 5L, 7L, 9L);
        log.info("批量删除完成，受影响的行数 {}" , rows);
    }

    @Test
    public void testCount(){
        int count =  mapper.count();
        log.info("查询结果 {}",count);
    }

    @Test
    public void testSelect(){
        Long id = 3L;
        AlbumDetailVO albumDetailVO = mapper.getById(id);
        log.info("根据id= {}",id,"查询完成:",albumDetailVO);
    }

    @Test
    public void testList() {
        List<AlbumListItemVO> list = mapper.list();
        log.info("查询列表完成，结果集中的数据的数量=" + list.size());
        for (AlbumListItemVO item : list) {
            log.info("{}",item);
        }
    }
}
