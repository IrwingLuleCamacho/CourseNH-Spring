package com.ilulecam.course.product.infraestructure.repository;

import com.ilulecam.course.product.application.dto.InventoryDto;
import com.ilulecam.course.product.application.dto.ProductDto;
import com.ilulecam.course.product.application.mapper.IProductMapper;
import com.ilulecam.course.product.domain.entity.Inventory;
import com.ilulecam.course.product.domain.entity.Product;
import com.ilulecam.course.product.domain.repository.IProductRepository;
import com.ilulecam.course.product.infraestructure.crud.IProductCrudRepository;
import com.ilulecam.course.product.infraestructure.feign.IInventoryFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements IProductRepository {
    @Autowired
    private IProductCrudRepository _productCrudRepository;

    @Autowired
    private IProductMapper _productMapper;

    @Autowired
    private IInventoryFeign _inventoryFeign;

    @Override
    public List<ProductDto> getAll() {
        return _productMapper.productsDto((List<Product>)_productCrudRepository.findAll());
    }

    @Override
    public Optional<ProductDto> getById(Long productId) {
        return _productCrudRepository.findById(productId).map(product -> _productMapper.toProductDto(product));
    }

    @Override
    public Optional<ProductDto> getInventories(Long productId) {
        Optional<Product> product = _productCrudRepository.findById(productId);
        if(!product.isEmpty()) {
            ResponseEntity<List<Inventory>> responseEntity = _inventoryFeign.findByProductId(productId);
            List<Inventory> inventories = responseEntity.getBody();
            if (responseEntity.getStatusCode().value() == HttpStatus.OK.value()){
                product.get().setInventories(inventories);
            }
            return Optional.of(_productMapper.toProductDto(product.get()));
        }
        return Optional.empty();
    }


}
