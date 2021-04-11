package com.ilulecam.course.product.presentation.web.controller;

import com.ilulecam.course.product.application.dto.ProductDto;
import com.ilulecam.course.product.application.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private IProductService _productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll() {
        List<ProductDto> productsDto = _productService.getAll();
        if(!productsDto.isEmpty()) {
            return ResponseEntity.ok(productsDto);
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{productId}")
    public ResponseEntity<ProductDto> findById(@PathVariable(value = "productId") Long productId) {
        Optional<ProductDto> productDto = _productService.getById(productId);
        if(!productDto.isEmpty()) {
            return ResponseEntity.ok(productDto.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/{productId}/inventory")
    public ResponseEntity<ProductDto> getInventories(@PathVariable(value = "productId") Long productId) {
        Optional<ProductDto> productDto = _productService.getInventories(productId);
        if(!productDto.isEmpty()) {
            return ResponseEntity.ok(productDto.get());
        }
        return ResponseEntity.notFound().build();
    }
}
