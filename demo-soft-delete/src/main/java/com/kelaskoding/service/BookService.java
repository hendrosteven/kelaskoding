package com.kelaskoding.service;

import javax.persistence.EntityManager;

import com.kelaskoding.entity.Books;
import com.kelaskoding.repo.BookRepo;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private EntityManager entityManager;
    
    @Autowired
    private BookRepo repo;

    public Books create(Books books){
        return repo.save(books);
    }

    public void remove(Long id){
        repo.deleteById(id);
    }

    public Iterable<Books> findAll(boolean isDeleted){
        //return repo.findAll();
        Session session = entityManager.unwrap(Session.class);
        Filter filter = session.enableFilter("deletedBookFilter");
        filter.setParameter("isDeleted", isDeleted);
        Iterable<Books> books = repo.findAll();
        session.disableFilter("deletedBookFilter");
        return books;
    }
}
