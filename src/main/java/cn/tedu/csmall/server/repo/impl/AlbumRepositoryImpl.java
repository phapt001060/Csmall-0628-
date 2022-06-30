package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IAlbumRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumRepositoryImpl implements IAlbumRepository {

    public AlbumRepositoryImpl() {
        System.out.println("AlbumRepositoryImpl的构造方法已经执行");
    }

}
