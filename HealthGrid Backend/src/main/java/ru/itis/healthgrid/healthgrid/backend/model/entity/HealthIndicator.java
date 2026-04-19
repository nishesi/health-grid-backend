package ru.itis.healthgrid.healthgrid.backend.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table("health_indicator")
public class HealthIndicator {

    @Id
    private Long id;
    private String name;
    private BigDecimal value;
    private String status;
}
