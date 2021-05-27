package com.kelaskoding.controller;

import com.kelaskoding.dto.TransferRequest;
import com.kelaskoding.entity.Rekening;
import com.kelaskoding.service.RekeningService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rekening")
public class RekeningController {
    
    @Autowired
    private RekeningService service;

    @PostMapping
    public Rekening create(@RequestBody Rekening rekening){
        return service.create(rekening);
    }

    @GetMapping
    public Iterable<Rekening> findAll(){
        return service.findAll();
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferRequest transfer){
        service.transfer(transfer.getNorek1(), transfer.getNorek2(), transfer.getAmount());
    }
}
