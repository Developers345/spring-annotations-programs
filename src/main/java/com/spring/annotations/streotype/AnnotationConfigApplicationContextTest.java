package com.spring.annotations.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.annotations.streotype");
        Employee emp = context.getBean("employee",Employee.class);

    }
}
