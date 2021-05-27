package com.kelaskoding.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {

    @Override
    public Health health() {
        if (isDatabaseHealthGood()) {
            return Health
                .up()
                .withDetail("DatabaseService", "Service is running")
                .build();
        }
        return Health
            .down()
            .withDetail("DatabaseService", "Service is not available")
            .build();
    }

    public boolean isDatabaseHealthGood() {
        // logic kita untuk mengecek apakah database sehat
        return true;
    }

}
