package com.ilulecam.course.security.infrastructure.repository;

import com.ilulecam.course.security.domain.entity.User;
import com.ilulecam.course.security.infrastructure.feign.IUserFeign;
import com.ilulecam.course.security.application.dto.UserDto;
import com.ilulecam.course.security.application.mapper.IUserMapper;
import com.ilulecam.course.security.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private IUserFeign _userFeign;

    @Autowired
    private IUserMapper _userMapper;

    @Override
    public UserDto findByUsername(String username) {
        ResponseEntity<User> responseEntity = _userFeign.findByUsername(username);
        if(responseEntity.getStatusCode().equals(HttpStatus.OK)) {
            return _userMapper.toUserDto(responseEntity.getBody());
        }
        return null;
    }
}
