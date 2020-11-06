package com.web.api.repository.impl;

import com.web.api.entity.User;
import com.web.api.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryImpl implements UserRepository {

    private static List<User> users = new ArrayList<>();
    static {
        users.add(null);
    }

    @Override
    public Optional<User> getUser(Long id) {
        User user = users.get(id.intValue());
        return Optional.ofNullable(user);
    }

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }
}
