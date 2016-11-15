package org.lhl.spring.config.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lunhengle on 2016/11/14.
 * 配置spring mvc
 */
@Configuration
@EnableWebMvc
@ComponentScan({"org.lhl.spring.controller"})
public class MvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 重写编码格式.
     *
     * @param converters 编码格式集合
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        //重新设置 string 类型编码格式为 utf-8
        converters.add(stringHttpMessageConverter());
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    /**
     * 设置 字符串编码格式为 utf-8.
     *
     * @return 字符串编码
     */
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        Charset utf8 = Charset.forName("UTF-8");
        //默认设置 text/plain 为utf-8
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(utf8);
        //设置 text/html 为 utf-8
        MediaType mediaType = MediaType.parseMediaType("text/html;charset=UTF-8");
        List<MediaType> mediaTypes = new ArrayList<MediaType>();
        mediaTypes.add(mediaType);
        stringHttpMessageConverter.setSupportedMediaTypes(mediaTypes);
        return stringHttpMessageConverter;
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
