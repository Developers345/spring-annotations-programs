package com.spring.annotations.javaconfig.primitive.env;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EnvConfig.class);
        Player player = context.getBean("player", Player.class);
        System.out.println(player);

    }

}
