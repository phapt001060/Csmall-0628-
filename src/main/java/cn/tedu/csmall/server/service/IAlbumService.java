package cn.tedu.csmall.server.service;

import cn.tedu.csmall.server.pojo.dto.AlbumAddNewDTO;

public interface IAlbumService {
    /**
     *  增加相册
     * @param albumAddNewDTO
     */
    void addNew(AlbumAddNewDTO albumAddNewDTO);
}
