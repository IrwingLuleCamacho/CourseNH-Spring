package com.ilulecam.course.user.application.service;

import com.ilulecam.course.user.application.dto.UserDto;

public interface IUserService {
    UserDto findByUsername(String username);
    UserDto signInApplication(String username, String password);
}
