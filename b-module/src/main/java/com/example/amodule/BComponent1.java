package com.example.amodule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 04.07.2021.</p>
 * <p>Project: spring-properties-multimodule</p>
 * *
 */
@Component("bComponent1")
public class BComponent1 {

    @Value("${my.props.p1}") // navigation works
    String id;
    @Value("${extra.props.p1}") // navigation works
    String id2;

    public String getId() {
        return id;
    }

    public String getId2() {
        return id2;
    }
}
