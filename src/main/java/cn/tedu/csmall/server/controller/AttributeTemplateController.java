package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.IAttributeTemplateService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 属性模版控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "5. 属性模板管理模块")
@RequestMapping("/attribute-templates")
@RestController
public class AttributeTemplateController {

    @Autowired
    private IAttributeTemplateService attributeTemplateService;

    public AttributeTemplateController() {
        log.debug("创建控制器对象：AttributeTemplateController");
    }

}
