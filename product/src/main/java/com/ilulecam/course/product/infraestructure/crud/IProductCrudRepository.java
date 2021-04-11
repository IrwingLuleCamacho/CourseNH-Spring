package com.ilulecam.course.product.infraestructure.crud;

import com.ilulecam.course.product.domain.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductCrudRepository extends CrudRepository<Product, Long> {
}
