package com.sctrcd.supermini.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * This class is actually not necessary (DataSource with prefix "spring.datasource"
 * is automatically found by Spring in application.yml). But this serves as an
 * example of how multiple/custom datasources could be made
 */
@Configuration
@Profile("local")
public class LocalDbConfig {

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }


}
