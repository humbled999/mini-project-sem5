package com.sssp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CORS configuration is managed centrally in {@link SecurityConfig#corsConfigurationSource()}
 * to ensure Spring Security and Spring MVC apply the exact same origin rules.
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
}
