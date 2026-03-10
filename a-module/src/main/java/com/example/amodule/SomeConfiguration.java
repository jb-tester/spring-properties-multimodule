package com.example.amodule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SomeConfiguration {

    @Bean
    public BClazz1 bClazz1() {
        return new BClazz1();
    }
}
