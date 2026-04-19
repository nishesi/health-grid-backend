package ru.itis.healthgrid.healthgrid.backend.dto.request;

import lombok.Data;
import ru.itis.healthgrid.healthgrid.backend.dto.common.HealthStatus;

import java.math.BigDecimal;

@Data
public class HealthIndicatorRequest {
    private String name;
    private BigDecimal value;
    private HealthStatus status;
}
