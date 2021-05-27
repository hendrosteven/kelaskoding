package com.kelaskoding.repo;

import com.kelaskoding.entity.Books;

import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Books, Long>{
    
}
