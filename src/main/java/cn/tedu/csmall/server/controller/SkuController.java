package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISkuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SKU控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "7. SKU管理模块")
@RequestMapping("/skus")
@RestController
public class SkuController {

    @Autowired
    private ISkuService skuService;

    public SkuController() {
        log.debug("创建控制器对象：SkuController");
    }
}
