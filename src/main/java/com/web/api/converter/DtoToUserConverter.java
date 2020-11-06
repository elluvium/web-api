package com.web.api.converter;

import com.web.api.dto.UserDto;
import com.web.api.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DtoToUserConverter implements Converter<UserDto, User> {

    @Override
    public User convert(UserDto source) {
        User target = new User();
        BeanUtils.copyProperties(source, target);
        return target;
    }
}
