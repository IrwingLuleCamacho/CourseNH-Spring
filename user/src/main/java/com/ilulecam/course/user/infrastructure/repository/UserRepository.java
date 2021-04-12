package com.ilulecam.course.user.infrastructure.repository;

import com.ilulecam.course.user.application.dto.UserDto;
import com.ilulecam.course.user.application.mapper.IUserMapper;
import com.ilulecam.course.user.domain.repository.IUserRepository;
import com.ilulecam.course.user.infrastructure.pas.IUserPasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private IUserPasRepository _userPasRepository;

    @Autowired
    private IUserMapper _userMapper;

    @Override
    public UserDto findByUsername(String username) {
        return _userMapper.toUserDto(_userPasRepository.findByUsername(username));
    }

    @Override
    public UserDto signInApplication(String username, String password) {
        return _userMapper.toUserDto(_userPasRepository.signInApplication(username, password));
    }
}
