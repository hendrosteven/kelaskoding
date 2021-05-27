package com.kelaskoding.repo;

import com.kelaskoding.entity.Rekening;

import org.springframework.data.repository.CrudRepository;

public interface RekeningRepo extends CrudRepository<Rekening, Long>{
    
    public Rekening findByNorek(String norek);
}
