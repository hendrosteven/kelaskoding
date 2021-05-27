package com.kelaskoding.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class OtherService implements HealthIndicator {

    private boolean status = true;

    @Override
    public Health health() {
        if (isOtherServiceHealthGood()) {
            return Health
                .up()
                .withDetail("OtherService", "Service is running")
                .build();
        }
        return Health
            .down()
            .withDetail("OtherService", "Service is not available")
            .build();
    }

    public boolean isOtherServiceHealthGood() {
        // logic kita untuk mengecek apakah database sehat
        return status = !status;
    }

}
