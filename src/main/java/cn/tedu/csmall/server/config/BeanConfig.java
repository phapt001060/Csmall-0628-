package cn.tedu.csmall.server.config;

import cn.tedu.csmall.server.entity.Category;
import cn.tedu.csmall.server.service.CategoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Configuration
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
