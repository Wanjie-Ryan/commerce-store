package com.commerce.store.service;

import com.commerce.store.model.CategoryModel;
import com.commerce.store.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //method to get all categories.
    public List<CategoryModel> getAllCategories() {
//        List<CategoryModel> categories = categoryRepository.findAll();
        return categoryRepository.findAll();
    }

}
