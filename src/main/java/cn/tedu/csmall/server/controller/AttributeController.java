package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeController {

    @Autowired
    public IAttributeService attributeService;

    public AttributeController() {
        System.out.println("AttributeController的构造方法已经执行");
    }

}
