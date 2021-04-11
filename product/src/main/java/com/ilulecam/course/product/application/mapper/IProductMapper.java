package com.ilulecam.course.product.application.mapper;

import com.ilulecam.course.product.application.dto.ProductDto;
import com.ilulecam.course.product.domain.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = { IInventoryMapper.class })
public interface IProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "inventories", target = "inventoriesDto")
    })
    ProductDto toProductDto(Product product);

    List<ProductDto> productsDto(List<Product> products);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "createAt", ignore = true)
    })
    Product toProduct(ProductDto productDto);
}
