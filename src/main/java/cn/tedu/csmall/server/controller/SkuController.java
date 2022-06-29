package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISkuService;
import cn.tedu.csmall.server.service.ISpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkuController implements ISkuService {

    @Autowired
    public ISpuService iSpuService;

    public SkuController() {
        System.out.println("SkuController的构造方法已执行");
    }
}
