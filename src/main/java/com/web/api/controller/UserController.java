package com.web.api.controller;

import com.web.api.dto.UserDto;
import com.web.api.entity.User;
import com.web.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final ConversionService mvcConvertionService;

    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable Long id) {
        User user = userService.getUser(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return mvcConvertionService.convert(user, UserDto.class);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto addUser(@RequestBody UserDto userDto) {
        User user = mvcConvertionService.convert(userDto, User.class);
        User createdUser = userService.createUser(user);

        return mvcConvertionService.convert(createdUser, UserDto.class);
    }
}
