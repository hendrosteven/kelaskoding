package com.domain.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.domain.models.entities.Category;
import com.domain.models.repos.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category save(Category category) {
        if(category.getId()!=null){
            Category current = categoryRepo.findById(category.getId()).get();
            current.setName(category.getName());
            category = current;
        }       
        return categoryRepo.save(category);
    }

    

    public Category findOne(Long id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (!category.isPresent()) {
            return null;
        }
        return category.get();
    }

    public Iterable<Category> findAll() {
        return categoryRepo.findAll();
    }

    public void removeOne(Long id) {
        categoryRepo.deleteById(id);
    }

    public Iterable<Category> findByName(String name, Pageable pageable) {
        return categoryRepo.findByNameContains(name, pageable);
    }

    public Iterable<Category> saveBatch(Iterable<Category> categories) {
        return categoryRepo.saveAll(categories);
    }
}
