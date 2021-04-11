package com.ilulecam.course.item.presentation.web.controller;

import com.ilulecam.course.item.application.dto.ItemDto;
import com.ilulecam.course.item.application.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/items")
public class ItemController {
    @Autowired
    private IItemService _itemService;

    @GetMapping
    public ResponseEntity<List<ItemDto>> getAll() {
        List<ItemDto> itemsDto = _itemService.getAll();
        if(!itemsDto.isEmpty()) {
            return ResponseEntity.ok(itemsDto);
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{productId}/{quantity}")
    public ResponseEntity<ItemDto> getItem(@PathVariable(value = "productId") Long productId, @PathVariable(value = "quantity") Long quantity) {
        ItemDto itemDto = _itemService.getItem(productId, quantity);
        if(itemDto != null) {
            return ResponseEntity.ok(itemDto);
        }
        return ResponseEntity.notFound().build();
    }
}
