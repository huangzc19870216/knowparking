package com.consumer.feign.service;

import com.server.common.model.User;
import com.server.common.service.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018\1\24 0024.
 */

@FeignClient(value="service-hi",fallback = SchedualServiceHystric.class)
public interface SchedualService {

    @RequestMapping(value="/queryUserByName",method= RequestMethod.GET)
    String queryUser(@RequestParam("usname") String usname);

}
