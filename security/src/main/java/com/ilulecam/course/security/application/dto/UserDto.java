package com.ilulecam.course.security.application.dto;

import java.util.List;

public class UserDto {
    private Long sku;
    private String username;
    private String password;
    private Boolean active;
    private String firstName;
    private String lastName;
    private String email;
    private List<RoleDto> rolesDto;

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RoleDto> getRolesDto() {
        return rolesDto;
    }

    public void setRolesDto(List<RoleDto> rolesDto) {
        this.rolesDto = rolesDto;
    }
}
