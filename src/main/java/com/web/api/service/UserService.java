package com.web.api.service;

import com.web.api.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUser(Long id);
    User createUser(User user);
}
