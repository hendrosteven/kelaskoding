package com.kelaskoding.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HeavyLoadService {
    

    @Cacheable("data")
    public String getHeavyLoadData(){
        simulateSlowService();
        return "I get the heavy load data";
    }

    private void simulateSlowService(){
        try{
            Thread.sleep(3000L);
        }catch(InterruptedException ex){
            throw new IllegalStateException(ex);
        }
    }
}
