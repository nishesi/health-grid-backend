package ru.itis.healthgrid.healthgrid.backend.rest.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import ru.itis.healthgrid.healthgrid.backend.dto.request.HealthIndicatorRequest;
import ru.itis.healthgrid.healthgrid.backend.dto.response.HealthIndicatorResponse;

import java.util.List;

@Tag(name = "Health Indicators", description = "API for managing health indicators")
@RequestMapping("/api/v1/health-indicators")
public interface HealthIndicatorApi {

    @Operation(summary = "Get all health indicators")
    @GetMapping
    List<HealthIndicatorResponse> getAll();

    @Operation(summary = "Get health indicator by id")
    @GetMapping("/{id}")
    HealthIndicatorResponse getById(@Parameter(description = "Indicator id") @PathVariable Long id);

    @Operation(summary = "Create a new health indicator")
    @PostMapping
    HealthIndicatorResponse create(@RequestBody HealthIndicatorRequest request);

    @Operation(summary = "Delete health indicator by id")
    @DeleteMapping("/{id}")
    void delete(@Parameter(description = "Indicator id") @PathVariable Long id);
}
