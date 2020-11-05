package com.web.api.service;

import com.web.api.model.User;

public interface UserService {

    User getUser(String name, Long id);
}
