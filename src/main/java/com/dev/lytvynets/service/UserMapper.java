package com.dev.lytvynets.service;

import com.dev.lytvynets.dto.UserResponseDto;
import com.dev.lytvynets.model.User;

public interface UserMapper {
    UserResponseDto getUserResponseDto(User user);
}
