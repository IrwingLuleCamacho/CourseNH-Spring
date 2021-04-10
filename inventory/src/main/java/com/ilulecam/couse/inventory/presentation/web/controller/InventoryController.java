package com.ilulecam.couse.inventory.presentation.web.controller;

import java.util.List;

import com.ilulecam.couse.inventory.application.dto.InventoryDto;
import com.ilulecam.couse.inventory.application.service.IInventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {
    @Autowired
    private IInventoryService _inventoryService;

    @GetMapping(value = "/{productId}")
    public ResponseEntity<List<InventoryDto>> findByProductId(@PathVariable(value = "productId") Long productId) {
        List<InventoryDto> inventoriesDto = _inventoryService.findByProductId(productId);
        if(!inventoriesDto.isEmpty()) {
            return ResponseEntity.ok(inventoriesDto);
        }
        return ResponseEntity.notFound().build();
    }
}
