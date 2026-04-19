package ru.itis.healthgrid.healthgrid.backend.service.front;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.healthgrid.healthgrid.backend.dto.common.HealthStatus;
import ru.itis.healthgrid.healthgrid.backend.dto.request.HealthIndicatorRequest;
import ru.itis.healthgrid.healthgrid.backend.dto.response.HealthIndicatorResponse;
import ru.itis.healthgrid.healthgrid.backend.exception.EntityNotFoundException;
import ru.itis.healthgrid.healthgrid.backend.model.entity.HealthIndicator;
import ru.itis.healthgrid.healthgrid.backend.model.repository.HealthIndicatorRepository;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class HealthIndicatorService {

    private final HealthIndicatorRepository repository;

    public List<HealthIndicatorResponse> getAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(this::toResponse)
                .toList();
    }

    public HealthIndicatorResponse getById(Long id) {
        return repository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("HealthIndicator", id));
    }

    public HealthIndicatorResponse create(HealthIndicatorRequest request) {
        HealthIndicator entity = new HealthIndicator();
        entity.setName(request.getName());
        entity.setValue(request.getValue());
        entity.setStatus(request.getStatus() != null ? request.getStatus().name() : null);
        return toResponse(repository.save(entity));
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("HealthIndicator", id);
        }
        repository.deleteById(id);
    }

    private HealthIndicatorResponse toResponse(HealthIndicator entity) {
        HealthIndicatorResponse response = new HealthIndicatorResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setValue(entity.getValue());
        if (entity.getStatus() != null) {
            response.setStatus(HealthStatus.valueOf(entity.getStatus()));
        }
        return response;
    }
}
