package com.sctrcd.supermini.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("cloud")
public class CloudDbConfig extends AbstractCloudConfig {

    @Bean
    public DataSource primaryDataSource() {
        return connectionFactory().dataSource();
    }


}
