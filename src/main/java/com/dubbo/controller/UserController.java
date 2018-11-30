package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ll
 * @Date 2018/10/29 15:19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName() {
        System.out.println("tom");
        return userService.getUserName();
    }
}
