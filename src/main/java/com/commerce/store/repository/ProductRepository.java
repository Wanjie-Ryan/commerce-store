package com.commerce.store.repository;

import com.commerce.store.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    List<ProductModel> findByCategoryId(Long categoryId);

}
