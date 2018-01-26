package com.client.eureka.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018\1\24 0024.
 */
@Service
public class HelloService2 {
    public String sayHello2(String name){
        System.out.println(name+"2");
        return name;
    }
}
