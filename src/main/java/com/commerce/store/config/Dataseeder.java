package com.commerce.store.config;

import com.commerce.store.model.CategoryModel;
import com.commerce.store.model.ProductModel;
import com.commerce.store.repository.CategoryRepository;
import com.commerce.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
// this code will be executed once I run the application, with the help of commandLineRunner
public class Dataseeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        // when the app first runs, you have to delete all existing data in the DB
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // create categories
        CategoryModel electronics = new CategoryModel();
        electronics.setName("Electronics");

        CategoryModel clothing = new CategoryModel();
        clothing.setName("Clothing");

        CategoryModel home = new CategoryModel();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));

        // create products

        ProductModel phone = new ProductModel();
        phone.setName("Samsung Galaxy S21");
        phone.setDescription("Samsung Galaxy S21 5G Factory Unlocked Android Cell Phone 128GB US Version Smartphone Pro-Grade Camera 8K Video 12MP High Res");
        phone.setImageUrl("https://m.media-amazon.com/images/I/61n7c6ZyZkL._AC_SL1500_.jpg");
        phone.setPrice(799.99);
        phone.setCategory(electronics);

        ProductModel laptop = new ProductModel();
        laptop.setName("Victus by HP 16.1-inch Gaming Laptop");
        laptop.setDescription("Victus by HP 16.1-inch Gaming Laptop, AMD Ryzen 7 5800H, NVIDIA GeForce RTX 3060, 16 GB RAM, 512 GB SSD, Windows 10 Home (16-e0097nr, Mica Silver) ");
        laptop.setImageUrl("https://m.media-amazon.com/images/I/61n7c6ZyZkL._AC_SL1500_.jpg");
        laptop.setPrice(1000.99);
        laptop.setCategory(electronics);


        ProductModel jacket = new ProductModel();
        jacket.setName("Wanjie Wool Jackets");
        jacket.setDescription(" Wanjie Wool Jackets for All Day and Night MF-01");
        jacket.setImageUrl("https://m.media-amazon.com/images/I/61n7c6ZyZkL._AC_SL1500_.jpg");
        jacket.setPrice(1300.99);
        jacket.setCategory(clothing);


        ProductModel blender = new ProductModel();
        blender.setName("HP Blender");
        blender.setDescription("HP Blender for All Day and Night MF-01");
        blender.setImageUrl("https://m.media-amazon.com/images/I/61n7c6ZyZkL._AC_SL1500_.jpg");
        blender.setPrice(100.99);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));

    }
}
