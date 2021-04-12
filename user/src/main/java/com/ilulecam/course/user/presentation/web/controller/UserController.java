package com.ilulecam.course.user.presentation.web.controller;

import com.ilulecam.course.user.application.dto.UserDto;
import com.ilulecam.course.user.application.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private IUserService _userService;

    @GetMapping(value = "/findByUsername")
    public ResponseEntity<UserDto> findByUsername(@Param(value = "username") String username) {
        UserDto userDto = _userService.findByUsername(username);
        if(userDto != null) {
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/signInApplication")
    public ResponseEntity<UserDto> signInApplication(@Param(value = "username") String username, @Param(value = "password") String password) {
        UserDto userDto = _userService.signInApplication(username, password);
        if(userDto != null) {
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    }
}
