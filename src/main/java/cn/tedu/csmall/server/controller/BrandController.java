package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.web.JsonResult;
import cn.tedu.csmall.server.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.server.pojo.dto.BrandEditDTO;
import cn.tedu.csmall.server.service.IBrandService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 品牌控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "1. 品牌管理模块")
@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private IBrandService brandService;

    public BrandController() {
        log.debug("创建控制器对象：BrandController");
    }

    // http://localhost:8080/brands/add-new?name=XiaoMi&pinyin=xiaomi&logo=xxx&categoryId=998&description=hahaha&keywords=mi&sort=66
    @ApiOperation("创建品牌")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult addNew(BrandAddNewDTO brandAddNewDTO) {
        log.debug("接收到的请求参数：{}", brandAddNewDTO);
        brandService.addNew(brandAddNewDTO);
        return JsonResult.ok();
    }

    // http://localhost:8080/brands/6937/edit?name=XiaoMi&pinyin=xiaomi&logo=xxx&categoryId=998&description=hahaha&keywords=mi&sort=66
    @ApiOperation("编辑品牌")
    @ApiOperationSupport(order = 300)
    @PostMapping("/{id:[0-9]+}/edit")
    public String edit(@PathVariable Long id, BrandEditDTO brandEditDTO) {
        log.debug("接收到的请求参数：id=" + id);
        log.debug("接收到的请求参数：" + brandEditDTO);
        return "尝试编辑品牌（尚未完成）";
    }

}
