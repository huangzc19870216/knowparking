package com.client.eureka.controller;

import com.server.common.model.User;
import com.server.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018\1\25 0025.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/queryUserByName")
    public String queryUserByName(@RequestParam("usname") String usname){
        //String username="aaa";
        userService.queryUser(usname);
        return usname;
    }

    @RequestMapping("/queryUser")
    public String queryUser(User user){
        userService.queryUser(user);
        return user.getUsername();
    }
}
