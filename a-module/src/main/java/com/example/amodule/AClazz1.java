package com.example.amodule;

import org.springframework.beans.factory.annotation.Value;


public class AClazz1 {

    @Value("${prop.for.bean}")
    String id;
    @Value("${extra.props.p3}")
    String id2;
    @Value("${imported.props.prop1:default}")
    String prop;

    public String getIds() {
        return id+", "+id2+", "+prop;
    }
}
