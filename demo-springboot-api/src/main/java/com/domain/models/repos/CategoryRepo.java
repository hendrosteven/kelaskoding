package com.domain.models.repos;

import com.domain.models.entities.Category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepo extends PagingAndSortingRepository<Category, Long>{
    
    Page<Category> findByNameContains(String name, Pageable pageable);
}
