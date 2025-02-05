package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")
public class AppConfig {

    @Bean
    public Product product() {
        return new Product();
    }
}