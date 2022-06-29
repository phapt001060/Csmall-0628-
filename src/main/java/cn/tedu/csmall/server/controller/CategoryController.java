package cn.tedu.csmall.server.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// 需要被Spring创建对象的类型，必须：
// 1. 添加组件注解
//      基础的组件注解有：@Component（通用） / @Controller（控制器） / @Service（业务） / @Repository（存储）
//      在Spring框架的作用范围内，以上4个注解是等效的
// 2. 必须在“组件扫描”的包下
//      Spring框架会执行“组件扫描”操作，会在某个包下查找所有的类，如果类上添加了组件注解，就会创建此类的对象
//      Spring Boot项目默认执行了组件扫描，且扫描的包就是创建项目时已生成的包
//      组件扫描的包都是指的“根包”，组件类放在此根包下的各层级子孙包中也都是有效的
@RestController
@RequestMapping( "/categories")
public class CategoryController {

    public CategoryController() {
        System.out.println("CategoryController的构造方法已经执行");
    }


    @RequestMapping(value = "/add-new-category",method = RequestMethod.POST)
    public String add(){
        System.out.println("CategoryController.add()");
        return "已经处理增加类别的请求";
    }


    //假设接下来的是"删除类别"的处理
    @RequestMapping("/delete-category")
    public String delete(){
        System.out.println("CategoryController.delete()");
        return "响应成功";
    }

    @RequestMapping("/update-by-id")
    public String update(){
        System.out.println("CategoryController.update");
        return "即将根据修改类别信息(尚未完成)";
    }

    @RequestMapping("/list")
    public String list(){
        System.out.println("CategoryController.list");
        return "即将查看类别列表";
    }
}
