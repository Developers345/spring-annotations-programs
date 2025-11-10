package com.spring.annotations.jcas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JCASTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.annotations.jcas");
        Robot robot = context.getBean("robot", Robot.class);
        System.out.println(robot);
    }
}