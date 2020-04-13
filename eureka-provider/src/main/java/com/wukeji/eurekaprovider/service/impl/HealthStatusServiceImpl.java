package com.wukeji.eurekaprovider.service.impl;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class HealthStatusServiceImpl implements HealthIndicator {
    private Boolean status = true;

    public void setStatus(Boolean status) {
        this.status  = status;
    }

    @Override
    public Health health() {
        // TODO Auto-generated method stub
        if(status)
            return new Health.Builder().up().build();
        return new Health.Builder().down().build();
    }

    public String getStatus() {
        // TODO Auto-generated method stub
        return this.status.toString();
    }
}
