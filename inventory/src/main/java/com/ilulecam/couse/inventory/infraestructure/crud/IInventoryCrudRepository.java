package com.ilulecam.couse.inventory.infraestructure.crud;

import java.util.List;

import com.ilulecam.couse.inventory.domain.entity.Inventory;

import org.springframework.data.repository.CrudRepository;

public interface IInventoryCrudRepository extends CrudRepository<Inventory, Long> {
    List<Inventory> findByProductId(Long productId);
}
