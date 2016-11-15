package org.lhl.spring.config.javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by lunhengle on 2016/11/11.
 * spring 配置文件
 */
@Configuration
@PropertySource({"classpath:/properties/config.properties"})
@Import({DataConfig.class})
@ComponentScan({"org.lhl.spring.bean", "org.lhl.spring.dao", "org.lhl.spring.service"})
public class AppConfig {
}
