package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAttributeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 属性控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "4. 属性管理模块")
@RequestMapping("/attributes")
@RestController
public class AttributeController {

    @Autowired
    private IAttributeService attributeService;

    public AttributeController() {
        log.debug("创建控制器对象：AttributeController");
    }

}
