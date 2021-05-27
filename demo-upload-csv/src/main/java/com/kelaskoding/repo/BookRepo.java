package com.kelaskoding.repo;

import com.kelaskoding.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
    
}
