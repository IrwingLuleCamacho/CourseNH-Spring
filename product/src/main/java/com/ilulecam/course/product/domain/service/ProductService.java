package com.ilulecam.course.product.domain.service;

import com.ilulecam.course.product.application.dto.ProductDto;
import com.ilulecam.course.product.application.service.IProductService;
import com.ilulecam.course.product.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository _productRepository;

    @Override
    public List<ProductDto> getAll() {
        return _productRepository.getAll();
    }

    @Override
    public Optional<ProductDto> getById(Long productId) {
        return _productRepository.getById(productId);
    }

    @Override
    public Optional<ProductDto> getInventories(Long productId) {
        return _productRepository.getInventories(productId);
    }
}
