package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.server.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.server.service.IAlbumService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(tags = "1.相册管理模块")
@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    public IAlbumService albumService;

    public AlbumController() {
        System.out.println("AlbumController的构造方法已经执行");
    }

    // http://localhost:8080/albums/add-new?name=asdfas=123&sort=111
    @PostMapping("/add-new")
    public String addNew(AlbumAddNewDTO albumAddNewDTO) {
        log.debug("接收到的请求参数：{}",albumAddNewDTO);
        albumService.addNew(albumAddNewDTO);
        return "增加相册";
    }
}
