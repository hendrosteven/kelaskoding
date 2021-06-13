package com.kelaskoding.scheduler;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedulerTask {
    
    @Scheduled(cron = "0 * * ? * *")
    public void scheduleFixDelayTask() throws InterruptedException{
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Fixed delay task - "+ fmt.format(System.currentTimeMillis()));
        //Thread.sleep(10000);		
    }
}
