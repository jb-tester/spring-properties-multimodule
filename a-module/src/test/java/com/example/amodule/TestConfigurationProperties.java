package com.example.amodule;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "my.test.props")
public class TestConfigurationProperties {

    String prop1;
    String prop2;

    public String getProp2() {
        return prop2;
    }
// the property is set in the main application.properties, but there is no icon:
    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp1() {
        return prop1;
    }
    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
