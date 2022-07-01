package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AlbumMapperTests {
    @Autowired
    AlbumMapper mapper;

    @Test
    public void testInsert(){
        Album album = new Album();
        album.setName("图片");
        System.out.println("测试添加之间"+album);
        int rows = mapper.insert(album);
        System.out.println("rows="+rows);
        System.out.println("测试添加之后"+album);
    }

    @Test
    public void testUpdateNameById(){
        Long id = 3L;
        String name = "猪哥哥";
        int rows = mapper.updateNameById(id,name);
        System.out.println("修改完成"+rows);
    }

    @Test
    public void testDeleteById(){
        Long id = 1L;
        int rows = mapper.deleteById(id);
        System.out.println("删除完成,收影响行数="+rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(2L, 3L, 5L, 7L, 9L);
        System.out.println("批量删除完成，受影响的行数=" + rows);
    }
}
