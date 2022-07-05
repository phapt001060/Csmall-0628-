package cn.tedu.csmall.server.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Configuration
@MapperScan("cn.tedu.csmall.server.mapper")
public class MybatisConfiguration {

    public MybatisConfiguration() {
        log.debug("加载配置类：MybatisConfiguration");
    }

}