package com.ilulecam.course.product.application.dto;

import java.util.Date;

public class InventoryDto {
    private Long inventoryId;
    private Date date;
    private String description;
    private Double quantity;
    private Double price;
    private Long productId;
    private String type;

    public InventoryDto() {
    }

    public InventoryDto(Long inventoryId, Date date, String description, Double quantity, Double price, Long productId, String type) {
        this.inventoryId = inventoryId;
        this.date = date;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.productId = productId;
        this.type = type;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
