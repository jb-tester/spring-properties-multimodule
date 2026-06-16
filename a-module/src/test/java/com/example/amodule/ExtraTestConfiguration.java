package com.example.amodule;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(TestConfigurationProperties.class)
public class ExtraTestConfiguration {

}
