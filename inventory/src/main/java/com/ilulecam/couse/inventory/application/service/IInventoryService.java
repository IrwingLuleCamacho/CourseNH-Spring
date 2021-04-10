package com.ilulecam.couse.inventory.application.service;

import java.util.List;

import com.ilulecam.couse.inventory.application.dto.InventoryDto;

public interface IInventoryService {
    List<InventoryDto> findByProductId(Long productId);
}
