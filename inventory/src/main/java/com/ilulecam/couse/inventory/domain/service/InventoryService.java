package com.ilulecam.couse.inventory.domain.service;

import java.util.List;

import com.ilulecam.couse.inventory.application.dto.InventoryDto;
import com.ilulecam.couse.inventory.application.service.IInventoryService;
import com.ilulecam.couse.inventory.domain.repository.IInventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService implements IInventoryService {
    @Autowired
    private IInventoryRepository _inventoryRepository;

    @Override
    public List<InventoryDto> findByProductId(Long productId) {
        return _inventoryRepository.findByProductId(productId);
    }
}
