package com.web.api.service.impl;

import com.web.api.entity.User;
import com.web.api.repository.UserRepository;
import com.web.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUser(Long id) {
        return userRepository.getUser(id);
    }

    public User createUser(User user) {
        userRepository.createUser(user);
        return user;
    }
}
