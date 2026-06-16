package com.example.bmodule;

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

    @Value("${my.a.props.p2}") // navigation doesn't work (IDEA 2023.1) - fixed
    String id;
    @Value("${extra.props.p2}") // navigation works
    String id2;
    @Value("${my.b.props.prop2}")
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
