package com.kelaskoding.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import com.kelaskoding.entity.Book;
import com.kelaskoding.repo.BookRepo;
import com.kelaskoding.utility.CSVHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service("bookService")
@Transactional
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> save(MultipartFile file){
        try{
            List<Book> books = CSVHelper.csvToBooks(file.getInputStream());
            return bookRepo.saveAll(books);
        }catch(IOException e){
            throw new RuntimeException("fail to store csv data: "+ e.getMessage());
        }
    }

    public List<Book> findAll(){
        return bookRepo.findAll();
    }
    
}
