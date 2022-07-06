package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.pojo.dto.AttributeTemplateAddNewDTO;
import cn.tedu.csmall.server.service.IAttributeTemplateService;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 属性模板控制器
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

    @ApiOperation("创建属性模板")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(AttributeTemplateAddNewDTO attributeTemplateAddNewDTO) {
        log.debug("接收到的请求参数：{}", attributeTemplateAddNewDTO);
        attributeTemplateService.addNew(attributeTemplateAddNewDTO);
        return JsonResult.ok();
    }

}
