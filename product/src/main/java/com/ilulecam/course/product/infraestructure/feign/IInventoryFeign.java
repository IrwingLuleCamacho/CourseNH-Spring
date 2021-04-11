package com.ilulecam.course.product.infraestructure.feign;

import com.ilulecam.course.product.domain.entity.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "inventory-service", decode404 = true)
@RequestMapping(value = "/inventory")
public interface IInventoryFeign {
    @GetMapping(value = "/{productId}")
    ResponseEntity<List<Inventory>> findByProductId(@PathVariable(value = "productId") Long productId);
}
