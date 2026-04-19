package ru.itis.healthgrid.healthgrid.backend.model.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itis.healthgrid.healthgrid.backend.model.entity.HealthIndicator;

public interface HealthIndicatorRepository extends CrudRepository<HealthIndicator, Long> {
}
