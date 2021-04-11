package com.ilulecam.course.item.infrastructure.feign;

import com.ilulecam.course.item.domain.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "product-service", decode404 = true)
@RequestMapping(value = "/products")
public interface IProductFeign {
    @GetMapping
    ResponseEntity<List<Product>> getAll() ;

    @GetMapping(value = "/{productId}")
    ResponseEntity<Product> findById(@PathVariable(value = "productId") Long productId);
}
