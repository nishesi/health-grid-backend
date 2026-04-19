package ru.itis.healthgrid.healthgrid.backend.exception;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(String entityName, Object id) {
        super(entityName + " not found with id: " + id);
    }
}
