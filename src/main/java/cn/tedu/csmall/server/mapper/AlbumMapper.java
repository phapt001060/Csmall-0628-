package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import org.apache.ibatis.annotations.Param;

import java.lang.annotation.Retention;


public interface AlbumMapper {
    /**
     *
     * @param album
     * @return
     */
    int insert (Album album);

    /**
     *
     * @param id
     * @param name
     * @return
     */
    int updateNameById(@Param("id") Long id,@Param("name") String name);
}
