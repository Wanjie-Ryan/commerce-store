package com.commerce.store.controller;

import com.commerce.store.model.CategoryModel;
import com.commerce.store.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // method to get all categories.
    @GetMapping
    public ResponseEntity<List<CategoryModel>> getAllCategories(){
        return new ResponseEntity <>(categoryService.getAllCategories(), HttpStatus.OK);
    }

}
