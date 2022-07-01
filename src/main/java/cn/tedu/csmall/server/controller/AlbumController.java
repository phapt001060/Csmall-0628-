package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @Autowired
    public IAlbumService albumService;

    public AlbumController() {
        System.out.println("AlbumController的构造方法已经执行");
    }
}
