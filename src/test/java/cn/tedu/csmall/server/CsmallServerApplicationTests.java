package cn.tedu.csmall.server;

import cn.tedu.csmall.server.controller.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
@Slf4j
public class CsmallServerApplicationTests {

    @Test
    public void testLogLevel() {
        log.trace("这是【trace】级别的日志……");
        log.debug("这是【debug】级别的日志……");
        log.info("这是【info】级别的日志……");
        log.warn("这是【warn】级别的日志……");
        log.error("这是【error】级别的日志……");
    }

    @Test
    public void contextLoads() {
        // 本测试方法是创建项目时即已生成的
        // 注意：应该在创建项目之初即执行此测试
        // 本测试方法中无任何实质代码，应该能够成功通过测试
        // 如此方法无法通过测试，可能的原因有：
        // 1. 当前类不在项目默认的根包或其子孙包下
        // 2. 包含创建项目后自行修改包名
        // 3. 当前类没有添加@SpringBootTest注解
        // 4. 项目的依赖项有误
        // 如果是添加了其它依赖项或编写了更多代码后出错，则可能是其它问题导致的
        // 其它说明：
        // 由于各组件均已按照“Controller -> Service -> Repository”的依赖关系添加自动装配的组件属性
        // 这些组件的创建和自动装配属性均会在启动项目、执行测试时进行
        // 所以，如果任何测试方法能够正常执行，则表示各组件的创建、自动装配属性均已正确完成
        // 反之，如果创建组件或自动装配属性的代码有误，则执行任何测试之初就会出现异常
        log.debug("Jsd2203CsmallServerTeacherApplicationTests.contextLoads()");
        log.debug("当你看到这句话时，表现你的项目中的创建组件、自动装配属性均已正确完成！");
    }

}






