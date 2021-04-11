package com.ilulecam.course.item.application.service;

import com.ilulecam.course.item.application.dto.ItemDto;

import java.util.List;

public interface IItemService {
    List<ItemDto> getAll();
    ItemDto getItem(Long productId, Long quantity);
}
