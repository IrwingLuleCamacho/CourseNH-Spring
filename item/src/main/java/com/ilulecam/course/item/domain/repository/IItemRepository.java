package com.ilulecam.course.item.domain.repository;

import com.ilulecam.course.item.application.dto.ItemDto;

import java.util.List;

public interface IItemRepository {
    List<ItemDto> getAll();
    ItemDto getItem(Long productId, Long quantity);
}
