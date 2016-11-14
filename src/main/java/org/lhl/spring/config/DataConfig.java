package org.lhl.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by lunhengle on 2016/11/11.
 * spring 数据库配置文件
 */
@Configuration
@Import({DevDataSourceConfig.class, ProdDataSourceConfig.class})
public class DataConfig {
}
