package com.ilulecam.course.user.domain.repository;

import com.ilulecam.course.user.application.dto.UserDto;

public interface IUserRepository {
    UserDto findByUsername(String username);
    UserDto signInApplication(String username, String password);
}
