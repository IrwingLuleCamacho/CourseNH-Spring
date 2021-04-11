package com.ilulecam.course.item.application.mapper;

import com.ilulecam.course.item.application.dto.ItemDto;
import com.ilulecam.course.item.domain.entity.Item;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = { IProductMapper.class })
public interface IItemMapper {
    @Mappings({
            @Mapping(source = "product", target = "productDto")
    })
    ItemDto toItemDto(Item item);

    List<ItemDto> toItemsDto(List<Item> items);

    @InheritInverseConfiguration
    Item toItem(ItemDto itemDto);
}
