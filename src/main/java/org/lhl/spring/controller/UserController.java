package org.lhl.spring.controller;

import org.lhl.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lunhengle on 2016/11/14.
 * 用户controller
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser() {
        return iUserService.getUser(1L).getUserName();
    }
}
