package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Picture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PictureMapperTests {
    @Autowired
    PictureMapper mapper;

    @Test
    public void testInsert(){
        Picture picture= new Picture();
        picture.setDescription("图片");
        int rows = mapper.insert(picture);
        System.out.println("rows="+rows);
    }

}
