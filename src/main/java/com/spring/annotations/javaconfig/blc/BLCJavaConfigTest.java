package com.spring.annotations.javaconfig.blc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BLCJavaConfigTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BLCJavaConfig.class);
        //ApplicationContext no need to write shudownhook class automatically registered unlike bean factory.
        ((ConfigurableApplicationContext)context).registerShutdownHook();
        Calculator calculator = context.getBean("calculator",Calculator.class);
        System.out.println(calculator);
    }
}
