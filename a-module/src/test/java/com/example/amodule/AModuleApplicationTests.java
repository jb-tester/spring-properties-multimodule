package com.example.amodule;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Import({TestConfigurationProperties.class})
class AModuleApplicationTests {

    @Value("${my.test.props.prop1}")
    String p1;
    @Value("${my.test.props.prop2}")
    String p2;
    @Value("${my.props.p1}")
    String myProp;

    @Test
    void testProperties() {
        System.out.println(p1);
        System.out.println(p2);
        assertEquals("confprop defined in A module Tests set in A Tests application.* used in same (A) module test", p1);
        assertEquals("confprop defined in A module Tests set in A main application.* used in same (A) module test", p2);
    }

}
