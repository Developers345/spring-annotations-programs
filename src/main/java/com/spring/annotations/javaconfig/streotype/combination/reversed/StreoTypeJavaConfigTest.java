package com.spring.annotations.javaconfig.streotype.combination.reversed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StreoTypeJavaConfigTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(StreoJavaComConfig.class);
        Toy toy = context.getBean("toy", Toy.class);
        System.out.println(toy);
    }
}
