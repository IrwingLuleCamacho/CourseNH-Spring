package com.ilulecam.course.product.domain.entity;

import java.util.Date;

public class Inventory {
    private Long id;
    private Date date;
    private String description;
    private Double quantity;
    private Double price;
    private Long productId;
    private String type;

    public Inventory() {
    }

    public Inventory(Long id, Date date, String description, Double quantity, Double price, Long productId, String type) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.productId = productId;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
