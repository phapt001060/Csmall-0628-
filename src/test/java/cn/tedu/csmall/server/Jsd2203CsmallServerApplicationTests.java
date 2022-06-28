package cn.tedu.csmall.server;

import cn.tedu.csmall.server.controller.AlbumController;
import cn.tedu.csmall.server.controller.BrandController;
import cn.tedu.csmall.server.controller.CategoryController;
import cn.tedu.csmall.server.controller.PictureController;
import cn.tedu.csmall.server.repo.IBrandRepository;
import cn.tedu.csmall.server.repo.impl.BrandRepositoryImpl2;
import cn.tedu.csmall.server.repo.impl.CategoryRepositoryImpl;
import cn.tedu.csmall.server.service.BrandServiceImpl;
import cn.tedu.csmall.server.service.CategoryService;
import cn.tedu.csmall.server.service.impl.AlbumServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class Jsd2203CsmallServerApplicationTests {

    @Test
    void contextLoads() {
    }

    //sping容器
    @Autowired
    AnnotationConfigApplicationContext ac;

    @Test
    void testGetBean(){
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
    public void testGetBeanSingleton(){
        CategoryService categoryService1 = ac.getBean(CategoryService.class);
        CategoryService categoryService2 = ac.getBean(CategoryService.class);
        CategoryService categoryService3 = ac.getBean(CategoryService.class);
        System.out.println(categoryService1);
        System.out.println(categoryService2);
        System.out.println(categoryService3);
    }

    @Test
     void getBean(){
        AlbumController albumController = ac.getBean(AlbumController.class);
        System.out.println(albumController);
        BrandController brandController = ac.getBean(BrandController.class);
        System.out.println(brandController);
        PictureController pictureController = ac.getBean(PictureController.class);
        System.out.println(pictureController);
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
    public void testAutowired(){
        System.out.println(categoryController);
        System.out.println(categoryService);
        System.out.println(categoryRepository);
        System.out.println(date);
    }

    @Autowired
    BrandServiceImpl brandService;
    @Autowired
    IBrandRepository brandRepository1;
    @Autowired
    BrandRepositoryImpl2 brandRepository2;

    @Test
    public void testBrandAutowired() {
        System.out.println("通过【接口】类型声明的Repository对象：");
        System.out.println(brandRepository1);
        System.out.println("通过【实现类】类型声明的Repository对象：");
        System.out.println(brandRepository2);
        System.out.println("查看【Service】中的Repository对象：");
        System.out.println(brandService.brandRepository);
    }

    @Autowired
    PictureController pictureController;

    @Autowired
    AlbumServiceImpl albumService;

    @Test
    public void testAlbumAutowired(){
        System.out.println(albumService.albumRepository);
    }

    @Autowired
    AlbumController albumController;

    @Test
    public void testAlbumControllerAutowired(){
        System.out.println(albumController.albumService);
    }
}
