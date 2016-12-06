package org.lhl.spring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lhl.spring.config.javaConfig.AppConfig;
import org.lhl.spring.config.javaConfig.MvcConfig;
import org.lhl.spring.controller.LoginController;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by lunhengle on 2016/12/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppConfig.class, MvcConfig.class})
@ActiveProfiles("test")
public class TestLoginPage {
    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = standaloneSetup(new LoginController()).setSingleView(new InternalResourceView("WEB-INF/views/login.jsp")).build();
    }

    @Test
    public void testLoginPage() throws Exception {
        mockMvc.perform(get("/login")).andExpect(status().isOk()).andExpect(view().name("login"));
    }
}
