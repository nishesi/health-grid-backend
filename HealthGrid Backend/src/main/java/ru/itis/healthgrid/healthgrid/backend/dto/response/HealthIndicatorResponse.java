package ru.itis.healthgrid.healthgrid.backend.dto.response;

import lombok.Data;
import ru.itis.healthgrid.healthgrid.backend.dto.common.HealthStatus;

import java.math.BigDecimal;

@Data
public class HealthIndicatorResponse {
    private Long id;
    private String name;
    private BigDecimal value;
    private HealthStatus status;
}
