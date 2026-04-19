package ru.itis.healthgrid.healthgrid.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories(basePackages = "ru.itis.healthgrid.healthgrid.backend.model.repository")
public class JdbcConfig {
}
