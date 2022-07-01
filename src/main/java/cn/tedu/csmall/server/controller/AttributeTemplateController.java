package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAttributeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeTemplateController {

    @Autowired
    public IAttributeTemplateService attributeTemplateService;

    public AttributeTemplateController() {
        System.out.println("AttributeTemplateController的构造方法已经执行");
    }

}
