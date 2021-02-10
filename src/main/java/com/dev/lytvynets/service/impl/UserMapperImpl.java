package com.dev.lytvynets.service.impl;

import com.dev.lytvynets.dto.UserResponseDto;
import com.dev.lytvynets.model.User;
import com.dev.lytvynets.service.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserMapperImpl implements UserMapper {
    @Override
    public User getUserEntity(UserResponseDto userResponseDto) {
        User user = new User();
        user.setFirstName(user.getFirstName());
        user.setLastName(userResponseDto.getLastName());
        user.setEmail(userResponseDto.getEmail());
        return user;
    }

    @Override
    public UserResponseDto getUserResponseDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setFirstName(user.getFirstName());
        userResponseDto.setLastName(user.getLastName());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
}
