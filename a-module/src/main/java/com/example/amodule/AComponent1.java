package com.example.amodule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 04.07.2021.</p>
 * <p>Project: spring-properties-multimodule</p>
 * *
 */
@Component("aComponent1")
public class AComponent1 {
    @Value("${my.props.p1}")
    String id;
    @Value("${extra.props.p1}")
    String id2;
    @Value("${prop.for.component}")
    String id3;

    public String getId() {
        return id;
    }

    public String getId2() {
        return id2;
    }

    public String getId3() {
        return id3;
    }
}
