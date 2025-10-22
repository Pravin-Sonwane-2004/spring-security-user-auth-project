package com.pravin.spring_security_learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
  @Bean
  @SneakyThrows
  public SecurityFilterChain security(HttpSecurity http) {
    http.authorizeHttpRequests( (req) -> {
      req.requestMatchers("/")
         .permitAll()
         .anyRequest()
         .authenticated();
    });
    return http.build();
  }
  
}
