package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISpuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SPU控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "6. SPU管理模块")
@RequestMapping("/spus")
@RestController
public class SpuController {

    @Autowired
    private ISpuService spuService;

    public SpuController() {
        log.debug("创建控制器对象：SpuController");
    }
}
