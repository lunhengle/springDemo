package org.lhl.spring.config;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by lunhengle on 2016/11/14.
 * servlet 3.0 替代web.xml java config 实现方式
 */
@Order(1)
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{MvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        //去掉也没有乱码 暂时注释掉 等到项目中出现错误了 在看看
      /*  CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        //设置编码格式
        characterEncodingFilter.setEncoding("UTF-8");
        //是否允许设置的encoding覆盖request response 已经存在的encodings
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[]{characterEncodingFilter};*/
        return new Filter[0];
    }

}
