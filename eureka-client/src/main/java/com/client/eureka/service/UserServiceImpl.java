package com.client.eureka.service;

import com.server.common.model.User;
import com.server.common.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018\1\25 0025.
 */
@Service(value="com.client.eureka.service.userService")
public class UserServiceImpl implements UserService {
    @Override
    public User queryUser(String username) {
        User user = new User();
        user.setUsername(username);

        return user;
    }

    @Override
    public User queryUser(User user) {
        user.setUsername("user");
        return user;
    }
}
