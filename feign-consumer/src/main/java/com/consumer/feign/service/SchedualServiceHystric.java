package com.consumer.feign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018\1\25 0025.
 */
@Component
public class SchedualServiceHystric implements SchedualService {
    @Override
    public String queryUser(String usname) {
        return "sorry "+usname;
    }
}
