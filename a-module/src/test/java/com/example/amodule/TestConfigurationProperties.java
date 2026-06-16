package com.example.amodule;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "my.test.props")
public class TestConfigurationProperties {

    String prop1;
    String prop2;

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp1() {
        return prop1;
    }
    public void setProp1(String prop1) {}
}
