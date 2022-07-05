package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.pojo.dto.AlbumAddNewDTO;

/**
 * 相册业务接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public interface IAlbumService {

    /**
     * 创建相册
     *
     * @param albumAddNewDTO 创建的相册数据
     */
    void addNew(AlbumAddNewDTO albumAddNewDTO);

}
