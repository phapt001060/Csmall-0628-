package cn.tedu.csmall.server.config;

import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

// 本例只是练习Spring框架创建对象的示例代码，在整个项目中并不发挥实质作用
// @Configuration
@Deprecated
public class BeanConfig {

    @Bean
    public Date date() {
        System.out.println("BeanConfig.date()");
        return new Date();
    }

    @Bean
    public Calendar calendar() {
        System.out.println("BeanConfig.calendar()");
        return Calendar.getInstance();
    }

    @Bean
    public LocalDateTime localDateTime() {
        System.out.println("BeanConfig.localDateTime()");
        return LocalDateTime.now();
    }

}
