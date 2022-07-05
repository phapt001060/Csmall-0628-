package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISkuService;
import cn.tedu.csmall.server.service.ISpuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "6.SKU管理模块")
@Slf4j
public class SkuController {

    @Autowired
    public ISkuService skuService;

    public SkuController() {
        System.out.println("SkuController的构造方法已经执行");
    }
}
