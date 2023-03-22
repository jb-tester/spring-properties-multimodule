package com.example.amodule;

import org.springframework.beans.factory.annotation.Value;


public class SomeBean {

    @Value("${prop.for.bean}")
    String id;
    @Value("${extra.props.p3}")
    String id2;

    public String getIds() {
        return id+" "+id2;
    }
}
