package com.ilulecam.course.security.application.service;

import com.ilulecam.course.security.application.dto.UserDto;

public interface IUserService {
    UserDto findByUsername(String username);
}
