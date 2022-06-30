package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AttributeController {

    @Autowired
    public IAttributeService attributeService;

    public AttributeController() {
        System.out.println("AttributeController的构造方法已经执行");
    }

}
