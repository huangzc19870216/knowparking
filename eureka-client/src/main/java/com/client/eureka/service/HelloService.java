package com.client.eureka.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018\1\24 0024.
 */
@Service
public class HelloService {


    public String sayHello(String name){
        System.out.println(name);
        return name;
    }
}
