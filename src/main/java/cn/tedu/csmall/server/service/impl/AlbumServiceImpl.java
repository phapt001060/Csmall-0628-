package cn.tedu.csmall.server.service.impl;


import cn.tedu.csmall.server.repo.impl.AlbumRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl {
    @Autowired
    public AlbumRepositoryImpl albumRepository;
    public AlbumServiceImpl() {
        System.out.println("AlbumServiceImpl的构造方法已执行");
    }

}
