package com.example.amodule;


import com.example.bmodule.BClazz1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfiguration {

    @Bean
    public AClazz1 someBean() {
        return new AClazz1();
    }
    @Bean
    public BClazz1 bClazz1() {
        return new BClazz1();
    }
}
