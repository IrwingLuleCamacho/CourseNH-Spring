package com.ilulecam.course.product.application.service;

import com.ilulecam.course.product.application.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<ProductDto> getAll();
    Optional<ProductDto> getById(Long productId);
    Optional<ProductDto> getInventories(Long productId);
}
