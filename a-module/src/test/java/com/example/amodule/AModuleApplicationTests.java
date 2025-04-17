package com.example.amodule;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AModuleApplicationTests {

    @Value("${my.props.p1}")
    String myProp;

    @Test
    void contextLoads() {
    }

}
