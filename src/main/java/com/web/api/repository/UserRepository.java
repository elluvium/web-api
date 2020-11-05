package com.web.api.repository;

import com.web.api.model.User;

public interface UserRepository {

    User getUser(Long id);
    User createUser(Long id, String name);
}
