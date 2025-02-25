package com.commerce.store.service;

import com.commerce.store.model.ProductModel;
import com.commerce.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // method to get all products.

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    // get all products that exist within a category, with the help of category id.
    public List<ProductModel> getProductByCategoryId(Long categoryId) {

        if (categoryId == null) {
            return List.of(); // ✅ Returns an empty list instead of running a query
        }
        return productRepository.findByCategoryId(categoryId);
    }

}
