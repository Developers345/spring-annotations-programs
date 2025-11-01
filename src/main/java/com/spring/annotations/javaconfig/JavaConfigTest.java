package com.spring.annotations.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Vehicle vehicle = context.getBean("newVehicle", Vehicle.class);
        vehicle.drive();
    }
}
