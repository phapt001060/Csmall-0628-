package cn.tedu.csmall.server.repo.impl;

import cn.tedu.csmall.server.repo.IAlbumRepository;
import cn.tedu.csmall.server.repo.ISpuRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpuRepositoryImpl implements ISpuRepository {

    public SpuRepositoryImpl() {
        System.out.println("SpuRepositoryImpl的构造方法已经执行");
    }

}
