package org.lhl.spring.config.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by lunhengle on 2016/11/11.
 * spring 数据库配置文件
 */
@Configuration
@PropertySource({"classpath:/properties/dev.properties", "classpath:/properties/prod.properties"})
public class DataConfig {
    @Autowired
    private Environment env;

    /**
     * 配置本机单元测试环境 内存 数据源.
     *
     * @return 数据源
     */
    @Bean
    @Profile("test")
    public DataSource embeddedDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.H2)
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScript("classpath:/sql/h2/schema.sql")
                .addScript("classpath:/data/h2/import-data.sql")
                .build();
    }

    /**
     * 配置开发环境 内存 数据源.
     *
     * @return 数据源
     */
    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        System.out.println(env.getProperty("dev.jdbc.driver"));
        System.out.println(env.getProperty("dev.jdbc.url"));
        System.out.println(env.getProperty("dev.jdbc.username"));
        System.out.println(env.getProperty("dev.jdbc.password"));
        return null;
    }

    /**
     * 配置生产环境 数据源.
     *
     * @return 数据源
     */
    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        System.out.println(env.getProperty("prod.jdbc.driver"));
        System.out.println(env.getProperty("prod.jdbc.url"));
        System.out.println(env.getProperty("prod.jdbc.username"));
        System.out.println(env.getProperty("prod.jdbc.password"));
        return null;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        if (env.getActiveProfiles()[0].equals("test")) {
            jdbcTemplate.setDataSource(embeddedDataSource());
        } else if (env.getActiveProfiles()[0].equals("dev")) {
            jdbcTemplate.setDataSource(devDataSource());
        } else if (env.getActiveProfiles()[0].equals("prod")) {
            jdbcTemplate.setDataSource(prodDataSource());
        }
        return jdbcTemplate;
    }
}
