package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.repo.IAlbumRepository;
import cn.tedu.csmall.server.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    public IAlbumRepository albumRepository;

    public AlbumServiceImpl() {
        System.out.println("AlbumServiceImpl的构造方法已经执行");
    }

}
