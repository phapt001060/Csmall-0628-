package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISkuService;
import cn.tedu.csmall.server.service.ISpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkuController {

    @Autowired
    public ISkuService skuService;

    public SkuController() {
        System.out.println("SkuController的构造方法已经执行");
    }
}
