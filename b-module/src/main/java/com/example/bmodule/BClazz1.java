package com.example.bmodule;


import org.springframework.beans.factory.annotation.Value;

public class BClazz1 {

    @Value("${prop.for.b-bean1}") // navigation works
    String foo;

    @Value("${extra.props.p4}")
    String bar;

    @Value("${imported.props.prop2}") // no navigation: the imported config is not resolved
    String buzz;

    public String getProps() {
        return foo + ", " + bar + ", " + buzz;
    }

}
