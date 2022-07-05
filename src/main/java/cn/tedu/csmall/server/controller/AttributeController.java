package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAttributeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "2.属性管理模块")
public class AttributeController {

    @Autowired
    public IAttributeService attributeService;

    public AttributeController() {
        System.out.println("AttributeController的构造方法已经执行");
    }

}
