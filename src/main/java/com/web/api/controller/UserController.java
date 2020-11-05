package com.web.api.controller;

import com.web.api.dto.UserDto;
import com.web.api.service.UserService;
import com.web.api.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final ConversionService mvcConvertionService;

    @GetMapping("/users/{id}")
    public UserDto first(
            @RequestParam(required = false) String name,
            @PathVariable Long id
    ) {
        User user = userService.getUser(name, id);
        return mvcConvertionService.convert(user, UserDto.class);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto second(@RequestBody UserDto userDto) {

        return null;
    }
}
