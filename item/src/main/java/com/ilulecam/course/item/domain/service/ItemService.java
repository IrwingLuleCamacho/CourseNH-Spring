package com.ilulecam.course.item.domain.service;

import com.ilulecam.course.item.application.dto.ItemDto;
import com.ilulecam.course.item.application.service.IItemService;
import com.ilulecam.course.item.domain.repository.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements IItemService {
    @Autowired
    private IItemRepository _itemRepository;

    @Override
    public List<ItemDto> getAll() {
        return _itemRepository.getAll();
    }

    @Override
    public ItemDto getItem(Long productId, Long quantity) {
        return _itemRepository.getItem(productId, quantity);
    }
}
