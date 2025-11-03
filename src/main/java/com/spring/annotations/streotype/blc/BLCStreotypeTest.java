package com.spring.annotations.streotype.blc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BLCStreotypeTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.annotations.streotype.blc");
        Calculator calculator = context.getBean("calculator",Calculator.class);
        //ApplicationContext no need to write shudownhook class automatically registered unlike bean factory.
        ((ConfigurableApplicationContext)context).registerShutdownHook();
        System.out.println(calculator);
    }

}
