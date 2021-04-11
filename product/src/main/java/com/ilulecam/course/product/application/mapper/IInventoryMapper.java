package com.ilulecam.course.product.application.mapper;

import java.util.List;

import com.ilulecam.course.product.application.dto.InventoryDto;
import com.ilulecam.course.product.domain.entity.Inventory;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IInventoryMapper {
    @Mappings({
            @Mapping(source = "id", target = "inventoryId")
    })
    InventoryDto toInventoryDto(Inventory inventory);

    List<InventoryDto> toInventoriesDto(List<Inventory> inventories);

    @InheritInverseConfiguration
    Inventory toInventory(InventoryDto inventoryDto);
}
