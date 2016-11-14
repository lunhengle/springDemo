package org.lhl.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by lunhengle on 2016/11/14.
 * 开发环境用到的数据源.
 */
@Configuration
@PropertySource({"classpath:/properties/dev.properties"})
@Profile("dev")
public class DevDataSourceConfig {
    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        System.out.println(env.getProperty("dev.jdbc.driver"));
        System.out.println(env.getProperty("dev.jdbc.url"));
        System.out.println(env.getProperty("dev.jdbc.username"));
        System.out.println(env.getProperty("dev.jdbc.password"));
        return null;
    }
}
