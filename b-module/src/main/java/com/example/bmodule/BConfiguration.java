package com.example.amodule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BConfiguration {

    @Bean
    public BClazz2 bClazz2() {
        return new BClazz2();
    }
}
