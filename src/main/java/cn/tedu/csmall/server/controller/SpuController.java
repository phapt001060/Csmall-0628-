package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ISpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpuController implements ISpuService {
    @Autowired
    public ISpuService spuService;
    public SpuController() {
        System.out.println("SpuController的构造方法已执行");
    }
}
