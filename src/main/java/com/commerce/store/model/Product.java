package com.commerce.store.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;


    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
