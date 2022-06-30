package cn.tedu.csmall.server;

import cn.tedu.csmall.server.controller.AlbumController;
import cn.tedu.csmall.server.controller.AttributeController;
import cn.tedu.csmall.server.controller.CategoryController;
import cn.tedu.csmall.server.controller.PictureController;
import cn.tedu.csmall.server.repo.IBrandRepository;
import cn.tedu.csmall.server.repo.impl.BrandRepositoryImpl;
import cn.tedu.csmall.server.repo.impl.BrandRepositoryImpl2;
import cn.tedu.csmall.server.repo.impl.CategoryRepositoryImpl;
import cn.tedu.csmall.server.service.BrandServiceImpl;
import cn.tedu.csmall.server.service.CategoryService;
import cn.tedu.csmall.server.service.impl.AlbumServiceImpl;
import cn.tedu.csmall.server.service.impl.AttributeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@SpringBootTest
public class Jsd2203CsmallServerApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("Jsd2203CsmallServerTeacherApplicationTests.contextLoads");
    }

    // ApplicationContext >>> Spring容器
    @Autowired
    public ApplicationContext ac;

    @Test
    public void testGetBean() {
        CategoryController categoryController = ac.getBean(CategoryController.class);
        System.out.println(categoryController);

        CategoryService categoryService = ac.getBean(CategoryService.class);
        System.out.println(categoryService);

        Date date = ac.getBean(Date.class);
        System.out.println(date);

        Calendar calendar = ac.getBean(Calendar.class);
        System.out.println(calendar);

        LocalDateTime localDateTime = ac.getBean(LocalDateTime.class);
        System.out.println(localDateTime);
    }

    @Test
    public void testGetBeanSingleton() {
        CategoryService categoryService1 = ac.getBean(CategoryService.class);
        CategoryService categoryService2 = ac.getBean(CategoryService.class);
        CategoryService categoryService3 = ac.getBean(CategoryService.class);
        System.out.println(categoryService1);
        System.out.println(categoryService2);
        System.out.println(categoryService3);
    }

    @Autowired
    CategoryController categoryController;
    @Autowired
    CategoryService categoryService;
    @Autowired
    CategoryRepositoryImpl categoryRepository;
    @Autowired
    Date date;

    @Test
    public void testAutowired() {
        System.out.println(categoryController);
        System.out.println(categoryService.categoryRepository);
        System.out.println(categoryRepository);
        System.out.println(date);
    }

    @Autowired
    BrandServiceImpl brandService;

    //@Autowired
    //IBrandRepository brandRepository1;
    @Autowired
    BrandRepositoryImpl2 brandRepository2;

    @Test
    public void testBrandAutowired() {
        //System.out.println("通过【接口】类型声明的Repository对象：");
        //System.out.println(brandRepository1);
        System.out.println("通过【实现类】类型声明的Repository对象：");
        System.out.println(brandRepository2);
        System.out.println("查看【Service】中的Repository对象：");
        System.out.println(brandService.brandRepositoryImpl2);
    }

    @Autowired
    PictureController pictureController;

    @Autowired
    AlbumServiceImpl albumService;

    @Test
    public void testAlbumAutowired() {
        System.out.println(albumService.albumRepository);
    }

    @Autowired
    AlbumController albumController;

    @Test
    public void testAlbumControllerAutowired() {
        System.out.println(albumController.albumService);
    }

    @Autowired
    AttributeServiceImpl attributeService;
    @Autowired
    AttributeController attributeController;

    @Test
    public void testAttributeAutowired() {
        System.out.println(attributeService.attributeRepository);
        System.out.println(attributeController.attributeService);
    }



}






