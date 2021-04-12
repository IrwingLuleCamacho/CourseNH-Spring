package com.ilulecam.course.security.application.mapper;

import com.ilulecam.course.security.application.dto.RoleDto;
import com.ilulecam.course.security.domain.entity.Role;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IRoleMapper {
    @Mappings({
            @Mapping(source = "roleId", target = "sku")
    })
    RoleDto toRoleDto(Role role);

    List<RoleDto> rolesDto(List<Role> roles);

    @InheritInverseConfiguration
    Role toRole(RoleDto roleDto);
}
