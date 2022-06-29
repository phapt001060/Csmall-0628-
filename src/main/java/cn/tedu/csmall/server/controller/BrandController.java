package cn.tedu.csmall.server.controller;

import cn.tedu.csmall.server.pojo.dto.BrandAddNewDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController {

    public BrandController() {
        System.out.println("BrandController的构造方法已经执行");
    }


    @RequestMapping("/add-new")
    public String add(BrandAddNewDTO brandAddNewDTO){
        System.out.println("BrandController.add");
        System.out.println("接收到的请求参数:"+brandAddNewDTO);
        return "即将增加品牌";
    }

    @RequestMapping("/update-by-id")
    public String update(){
        System.out.println("BrandController.update");
        return "即将根据id修改品牌信息";
    }

    @RequestMapping("/delete-by-id")
    public String delete(){
        System.out.println("BrandController.delete");
        return "即将根据id删除品牌信息";
    }

    @RequestMapping("/list")
    public String list(){
        System.out.println("BrandController.list");
        return "即将查看品牌列表";
    }
}
