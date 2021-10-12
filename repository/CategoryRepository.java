package com.onlinefurniture.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinefurniture.domain.stock.ProductCategory;

public interface CategoryRepository extends CrudRepository<ProductCategory,Long> {


}
