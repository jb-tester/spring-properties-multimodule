package com.example.amodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:extra.properties")
public class AModuleApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(AModuleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       AComponent1 acompo = ctx.getBean(AComponent1.class);
       BComponent1 bcompo = ctx.getBean(BComponent1.class);
        System.out.println(acompo.getId() + " " + acompo.getId2());
        System.out.println(bcompo.getId() + " " + bcompo.getId2());
    }
}
