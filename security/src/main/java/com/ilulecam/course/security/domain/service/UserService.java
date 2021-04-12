package com.ilulecam.course.security.domain.service;

import com.ilulecam.course.security.application.dto.UserDto;
import com.ilulecam.course.security.application.service.IUserService;
import com.ilulecam.course.security.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private IUserRepository _userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = _userRepository.findByUsername(username);
        if(userDto == null) {
            throw new UsernameNotFoundException("Error en el login, no existe el usuario " + username);
        }
        List<GrantedAuthority> authorities = userDto.getRolesDto()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
        return new User(userDto.getUsername(), userDto.getPassword(), userDto.getActive(), true, true, true, authorities);
    }
}
