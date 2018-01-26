package com.consumer.feign.controller;

import com.consumer.feign.service.SchedualService;
import com.server.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018\1\25 0025.
 */

@RestController
public class UserController {

    @Autowired
    SchedualService schedualService;


    @RequestMapping(value="/queryUser",method = RequestMethod.GET)
    public String queryUser(@RequestParam("usname") String usname){

       String username = schedualService.queryUser(usname);

        System.out.println("username = " +username);
        return username;
    }
}
