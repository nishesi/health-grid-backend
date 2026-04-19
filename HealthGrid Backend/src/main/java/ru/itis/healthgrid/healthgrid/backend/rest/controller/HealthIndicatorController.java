package ru.itis.healthgrid.healthgrid.backend.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.healthgrid.healthgrid.backend.dto.request.HealthIndicatorRequest;
import ru.itis.healthgrid.healthgrid.backend.dto.response.HealthIndicatorResponse;
import ru.itis.healthgrid.healthgrid.backend.rest.api.HealthIndicatorApi;
import ru.itis.healthgrid.healthgrid.backend.service.front.HealthIndicatorService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HealthIndicatorController implements HealthIndicatorApi {

    private final HealthIndicatorService service;

    @Override
    public List<HealthIndicatorResponse> getAll() {
        return service.getAll();
    }

    @Override
    public HealthIndicatorResponse getById(Long id) {
        return service.getById(id);
    }

    @Override
    public HealthIndicatorResponse create(HealthIndicatorRequest request) {
        return service.create(request);
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }
}
