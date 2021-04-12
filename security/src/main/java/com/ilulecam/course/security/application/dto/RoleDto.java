package com.ilulecam.course.security.application.dto;

public class RoleDto {
    private Long sku;
    private String name;

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
