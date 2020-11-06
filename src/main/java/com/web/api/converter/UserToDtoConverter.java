package com.web.api.converter;

import com.web.api.dto.UserDto;
import com.web.api.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToDtoConverter implements Converter<User, UserDto> {

    @Override
    public UserDto convert(User source) {
        UserDto target = new UserDto();
        BeanUtils.copyProperties(source, target);
        return target;
    }
}
