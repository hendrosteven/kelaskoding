package com.kelaskoding.controllers;

import com.kelaskoding.services.HeavyLoadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class HeavyController {
    
    @Autowired
    private HeavyLoadService heavyLoadService;

    @GetMapping
    public String getData(){
        return heavyLoadService.getHeavyLoadData();
    }
}
