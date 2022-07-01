package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    public CategoryController() {
        System.out.println("CategoryController的构造方法已经执行");
    }

    // 请求路径为 add-new，要求响应“已经处理增加类别的请求”这段文字
    // http://localhost:8080/categories/add-new
    @RequestMapping(value = "/add-new")
    public String addNew() {
        System.out.println("CategoryController.addNew()");
        return "已经处理增加类别的请求";
    }

    // 假设接下来是“删除类别”的处理
    // http://localhost:8080/categories/delete
    @RequestMapping("/delete")
    public String delete() {
        System.out.println("CategoryController.delete()");
        return "del";
    }

    @RequestMapping("/update-by-id")
    public String xx() {
        System.out.println("CategoryController.xx()");
        return "即将根据id修改类别信息（尚未完成）";
    }

}
