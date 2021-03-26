package com.domain.dto;

import javax.validation.constraints.NotEmpty;

import com.domain.models.entities.Category;


public class ProductData {
    
    private Long id;

    @NotEmpty(message="Name is required")
    private String name;

    @NotEmpty(message="Description is required")
    private String description;

    private double price;

    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    
}
