package com.example.amodule;

import com.example.bmodule.BComponent1;
import com.example.bmodule.MyBProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"com.example.amodule","com.example.bmodule"})
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
        BClazz1 bclazz1 = ctx.getBean(BClazz1.class);
        BClazz2 bClazz2 = ctx.getBean(BClazz2.class);
        System.out.println("property used in bean: " + someBean.getIds());
        System.out.println("properties used in same module component: " + acompo.getId() + ", " + acompo.getId2() + ", " + acompo.getId3());
        System.out.println("properties used in different module component: " + bcompo.getId() + ", " + bcompo.getId2());
        System.out.println("properties used in the diff module bean classes: " + bclazz1.getProps() + ", " + bClazz2.getFoo());

    }

    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }
}
