package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AlbumController implements IAlbumService {
    @Autowired
    public IAlbumService albumService;


    public AlbumController(){
        System.out.println("AlbumController的构造方法已执行");
    }
}
