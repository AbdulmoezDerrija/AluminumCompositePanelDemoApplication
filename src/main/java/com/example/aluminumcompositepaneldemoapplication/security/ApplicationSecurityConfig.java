package com.example.aluminumcompositepaneldemoapplication.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfiguration {
    
}
