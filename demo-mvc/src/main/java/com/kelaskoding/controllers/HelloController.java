package com.kelaskoding.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public ResponseEntity<?> hello(){
        Map<String, String> data = new HashMap<String, String>();
        data.put("greeting","Welcome to Spring!!");
        return ResponseEntity.ok(data);
    }
}
