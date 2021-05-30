package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.server.resource.web.BearerTokenResolver;
import org.springframework.security.oauth2.server.resource.web.HeaderBearerTokenResolver;

@SpringBootApplication
public class SampleApp {
    public static void main(String[] args) {
        SpringApplication.run(SampleApp.class, args);
    }

    @Bean
    public BearerTokenResolver xAuthTokenBearerTokenResolver() {
        return new HeaderBearerTokenResolver("X-Auth-Token");
    }
}
