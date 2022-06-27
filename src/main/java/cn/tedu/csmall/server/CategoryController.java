package cn.tedu.csmall.server;

import org.springframework.stereotype.Component;

//1.需要被Spring创建对象的类型,必须添加组件注解
//  基础的注解有 @Component(通用)  @Controller  @Service(业务)  @Repository(存储)
//  四个注解是等效的
//2.必须在"组件扫描"的包下
//
@Component
public class CategoryController {
    public CategoryController(){
        System.out.println("CategoryController的构造方法已执行");
    }
}
