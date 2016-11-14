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
 * 生产环境用到的数据源
 */
@Configuration
@PropertySource({"classpath:/properties/prod.properties"})
@Profile("prod")
public class ProdDataSourceConfig {
    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        System.out.println(env.getProperty("prod.jdbc.driver"));
        System.out.println(env.getProperty("prod.jdbc.url"));
        System.out.println(env.getProperty("prod.jdbc.username"));
        System.out.println(env.getProperty("prod.jdbc.password"));
        return null;
    }
}
