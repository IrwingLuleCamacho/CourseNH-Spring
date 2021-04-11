package com.ilulecam.course.item.application.dto;

public class ItemDto {
    private ProductDto productDto;
    private Long quantity;

    public ItemDto() {
    }

    public ItemDto(ProductDto productDto, Long quantity) {
        this.productDto = productDto;
        this.quantity = quantity;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return productDto.getPrice() * quantity.doubleValue();
    }
}
