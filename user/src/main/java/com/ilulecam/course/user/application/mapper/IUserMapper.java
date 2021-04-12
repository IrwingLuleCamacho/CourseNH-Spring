package com.ilulecam.course.user.application.mapper;

import com.ilulecam.course.user.application.dto.UserDto;
import com.ilulecam.course.user.domain.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = { IRoleMapper.class })
public interface IUserMapper {
    @Mappings({
            @Mapping(source = "id", target = "userId"),
            @Mapping(source = "roles", target = "rolesDto")
    })
    UserDto toUserDto(User user);

    List<UserDto> toUsersDto(List<User> users);

    @InheritInverseConfiguration
    User toUser(UserDto userDto);
}
