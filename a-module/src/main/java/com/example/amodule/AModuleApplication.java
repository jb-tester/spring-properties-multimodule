package com.example.amodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
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
       SomeBean someBean = ctx.getBean(SomeBean.class);
        System.out.println("property used in bean: "+someBean.getIds());
        System.out.println("properties used in same module component: " + acompo.getId() + ", " + acompo.getId2()+ ", " + acompo.getId3());
        System.out.println("properties used in different module component: " +bcompo.getId() + ", " + bcompo.getId2());
    }

    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }
}
