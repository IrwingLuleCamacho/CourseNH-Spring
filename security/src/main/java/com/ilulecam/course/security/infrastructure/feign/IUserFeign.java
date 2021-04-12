package com.ilulecam.course.security.infrastructure.feign;

import com.ilulecam.course.security.domain.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service", decode404 = true)
@RequestMapping(value = "/users")
public interface IUserFeign {
    @GetMapping(value = "/findByUsername")
    ResponseEntity<User> findByUsername(@RequestParam(value = "username") String username);
}
