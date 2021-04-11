package com.ilulecam.course.product.domain.repository;

import com.ilulecam.course.product.application.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    List<ProductDto> getAll();
    Optional<ProductDto> getById(Long productId);
    Optional<ProductDto> getInventories(Long productId);
}
