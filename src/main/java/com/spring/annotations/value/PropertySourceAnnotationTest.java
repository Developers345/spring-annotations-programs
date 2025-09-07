package com.spring.annotations.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.annotations.value");
        AutomaticRobo automaticRobo = context.getBean("automaticRobo",AutomaticRobo.class);
        System.out.println(automaticRobo);
    }
}
