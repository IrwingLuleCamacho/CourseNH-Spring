package com.ilulecam.couse.inventory.domain.repository;

import java.util.List;

import com.ilulecam.couse.inventory.application.dto.InventoryDto;

public interface IInventoryRepository {
    List<InventoryDto> findByProductId(Long productId);
}
