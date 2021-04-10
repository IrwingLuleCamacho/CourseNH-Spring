package com.ilulecam.couse.inventory.infraestructure.repository;

import java.util.List;

import com.ilulecam.couse.inventory.application.dto.InventoryDto;
import com.ilulecam.couse.inventory.application.mapper.IInventoryMapper;
import com.ilulecam.couse.inventory.domain.repository.IInventoryRepository;
import com.ilulecam.couse.inventory.infraestructure.crud.IInventoryCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepository implements IInventoryRepository {
    @Autowired
    private IInventoryCrudRepository _inventoryCrudRepository;

    @Autowired
    private IInventoryMapper _inventoryMapper;

    @Override
    public List<InventoryDto> findByProductId(Long productId) {
        return _inventoryMapper.toInventoriesDto(_inventoryCrudRepository.findByProductId(productId));
    }
}
