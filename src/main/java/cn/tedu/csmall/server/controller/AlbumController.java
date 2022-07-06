package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.server.service.IAlbumService;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 相册控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "3. 相册管理模块")
@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    public AlbumController() {
        log.debug("创建控制器对象：AlbumController");
    }

    // http://localhost:8080/albums/add-new
    @ApiOperation("创建相册")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(AlbumAddNewDTO albumAddNewDTO) {
        log.debug("接收到的请求参数：{}", albumAddNewDTO);
        albumService.addNew(albumAddNewDTO);
        return JsonResult.ok();
    }

}
