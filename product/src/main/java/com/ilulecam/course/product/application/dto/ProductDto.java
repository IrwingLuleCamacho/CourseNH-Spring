package com.ilulecam.course.product.application.dto;

import java.util.Date;
import java.util.List;

public class ProductDto {
    private Long productId;
    private String description;
    private Double price;
    private List<InventoryDto> inventoriesDto;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<InventoryDto> getInventoriesDto() {
        return inventoriesDto;
    }

    public void setInventoriesDto(List<InventoryDto> inventoriesDto) {
        this.inventoriesDto = inventoriesDto;
    }
}
