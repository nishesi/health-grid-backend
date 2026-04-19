package ru.itis.healthgrid.healthgrid.backend;

import org.springframework.boot.SpringApplication;

public class TestHealthGridBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(HealthGridBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
