package com.ilulecam.course.user.domain.service;

import com.ilulecam.course.user.application.dto.UserDto;
import com.ilulecam.course.user.application.service.IUserService;
import com.ilulecam.course.user.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository _userRepository;

    @Override
    public UserDto findByUsername(String username) {
        return _userRepository.findByUsername(username);
    }

    @Override
    public UserDto signInApplication(String username, String password) {
        return _userRepository.signInApplication(username, password);
    }
}
