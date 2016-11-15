package org.lhl.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lhl.spring.bean.User;
import org.lhl.spring.config.javaConfig.AppConfig;
import org.lhl.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lunhengle on 2016/11/14.
 * 测试 注解配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@ActiveProfiles("dev")
public class TestConfig {

    @Autowired
    private IUserService iUserService;

    @Test
    public void testAppConfig() {
        User user = iUserService.getUser(1L);
        System.out.println(user.getUserName());
    }

    @Test
    public void testListener() {

    }
}
