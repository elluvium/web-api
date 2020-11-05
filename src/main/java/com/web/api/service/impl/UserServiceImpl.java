package com.web.api.service.impl;

import com.web.api.service.UserService;
import com.web.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public User getUser(String name, Long id) {
        return new User(id, name);
    }
}
