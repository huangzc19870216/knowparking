package com.server.common.service;

import com.server.common.model.User;

/**
 * Created by Administrator on 2018\1\25 0025.
 */

public interface UserService {

    User queryUser(String username);

    User queryUser(User user);
}
