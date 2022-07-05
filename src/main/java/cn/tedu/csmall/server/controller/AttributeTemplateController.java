package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAttributeTemplateService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "3.属性模板模块")
public class AttributeTemplateController {

    @Autowired
    public IAttributeTemplateService attributeTemplateService;

    public AttributeTemplateController() {
        System.out.println("AttributeTemplateController的构造方法已经执行");
    }

}
