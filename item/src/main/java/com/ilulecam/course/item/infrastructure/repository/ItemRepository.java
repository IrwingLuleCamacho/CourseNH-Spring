package com.ilulecam.course.item.infrastructure.repository;

import com.ilulecam.course.item.application.dto.ItemDto;
import com.ilulecam.course.item.application.dto.ProductDto;
import com.ilulecam.course.item.application.mapper.IProductMapper;
import com.ilulecam.course.item.domain.entity.Product;
import com.ilulecam.course.item.domain.repository.IItemRepository;
import com.ilulecam.course.item.infrastructure.feign.IProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ItemRepository implements IItemRepository {
    @Autowired
    private IProductFeign _productFeign;

    @Autowired
    private IProductMapper _productMapper;

    @Override
    public List<ItemDto> getAll() {
        ResponseEntity<List<Product>> responseEntity = _productFeign.getAll();
        if(responseEntity.getStatusCode().equals(HttpStatus.OK)) {
            return _productMapper.toProductsDto(responseEntity.getBody())
                    .stream()
                    .map(product -> new ItemDto(product, 1L))
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public ItemDto getItem(Long productId, Long quantity) {
        ResponseEntity<Product> responseEntity = _productFeign.findById(productId);
        if(responseEntity.getStatusCode().equals(HttpStatus.OK)) {
            ProductDto productDto = _productMapper.toProductDto(responseEntity.getBody());
            return new ItemDto(productDto, quantity);
        }
        return null;
    }
}
