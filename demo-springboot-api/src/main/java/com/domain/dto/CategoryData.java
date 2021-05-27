package com.domain.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {

    private Long id;
    
    @NotEmpty(message="Name is required")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    
}
