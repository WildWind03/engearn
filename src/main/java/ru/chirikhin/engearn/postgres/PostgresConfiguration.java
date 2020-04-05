package ru.chirikhin.engearn.postgres;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class PostgresConfiguration {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSourceConfig = new DriverManagerDataSource();
        dataSourceConfig.setDriverClassName("org.postgresql.Driver");
        dataSourceConfig.setUrl("jdbc:postgresql://localhost:12345/postgres");
        dataSourceConfig.setUsername("engearn");
        dataSourceConfig.setPassword("engearn");
        return dataSourceConfig;
    }
}