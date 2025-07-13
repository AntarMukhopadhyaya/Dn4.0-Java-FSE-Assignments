package com.cognizant.spring_learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {
    @Bean
    public UserDetailsService users(){
        return new InMemoryUserDetailsManager(
                User.withUsername("user")
                        .password("pwd")
                        .roles("USER")
                        .build()
        );

    }
    @Bean
    public static org.springframework.security.crypto.password.PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
