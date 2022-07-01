package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Picture;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PictureMapper  {
    /**
     *
     * @param picture
     * @return
     */
    int insert(Picture picture);
}
