package com.ilulecam.course.security.domain.repository;

import com.ilulecam.course.security.application.dto.UserDto;

public interface IUserRepository {
    UserDto findByUsername(String username);
}
