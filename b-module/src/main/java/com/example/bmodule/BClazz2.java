package com.example.amodule;


import org.springframework.beans.factory.annotation.Value;

public class BClazz2 {

    @Value("${prop.for.b-bean2}") // navigation works
    String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
