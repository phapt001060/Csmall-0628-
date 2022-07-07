package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.pojo.dto.CategoryAddNewDTO;
import cn.tedu.csmall.server.service.ICategoryService;
import cn.tedu.csmall.server.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ====================================================
// 以下部分是笔记
// ====================================================
// 需要被Spring创建对象的类型，必须：
// 1. 添加组件注解
//      基础的组件注解有：@Component（通用） / @Controller（控制器） / @Service（业务） / @Repository（存储）
//      在Spring框架的作用范围内，以上4个注解是等效的
// 2. 必须在“组件扫描”的包下
//      Spring框架会执行“组件扫描”操作，会在某个包下查找所有的类，如果类上添加了组件注解，就会创建此类的对象
//      Spring Boot项目默认执行了组件扫描，且扫描的包就是创建项目时已生成的包
//      组件扫描的包都是指的“根包”，组件类放在此根包下的各层级子孙包中也都是有效的
// ====================================================

/**
 * 类别控制器
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Api(tags = "2. 类别管理模块")
@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    public CategoryController() {
        log.debug("创建控制器对象：CategoryController");
    }

    // 请求路径为 add-new，要求响应“已经处理创建类别的请求”这段文字
    // http://localhost:8080/categories/add-new
    @ApiOperation("创建类别")
    @ApiOperationSupport(order = 100)
    @PostMapping(value = "/add-new")
    public JsonResult addNew(CategoryAddNewDTO categoryAddNewDTO) {
        log.debug("接收到的请求参数：{}", categoryAddNewDTO);
            categoryService.addNew(categoryAddNewDTO);
        return JsonResult.ok();
    }

    // 假设接下来是“删除类别”的处理
    // http://localhost:8080/categories/delete
    @ApiOperation("删除类别")
    @ApiOperationSupport(order = 200)
    @PostMapping("/delete")
    public String delete() {
        log.debug("CategoryController.delete()");
        throw new NullPointerException("尝试删除类别时出现NPE");
        // return "del";
    }

    @PostMapping("/update-by-id")
    @ApiOperation("修改类别")
    @ApiOperationSupport(order = 300)
    public String update() {
        int[] arr = new int[5];
        System.out.println(arr[-1]);
        log.debug("CategoryController.xx()");
        return "即将根据id修改类别信息（尚未完成）";
    }

}
