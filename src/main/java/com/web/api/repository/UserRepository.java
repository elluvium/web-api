package com.web.api.repository;

import com.web.api.entity.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> getUser(Long id);
    User createUser(User user);
}
