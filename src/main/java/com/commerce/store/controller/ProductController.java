package com.commerce.store.controller;

import com.commerce.store.model.ProductModel;
import com.commerce.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    // api to get all the products

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    // get all products that exist within a category, with the help of category id.

    @GetMapping("/{categoryId}/productcategory")
    public ResponseEntity<List<ProductModel>> getProductByCategoryId(@PathVariable Long categoryId) {
        return new ResponseEntity<>(productService.getProductByCategoryId(categoryId), HttpStatus.OK);
    }


}
