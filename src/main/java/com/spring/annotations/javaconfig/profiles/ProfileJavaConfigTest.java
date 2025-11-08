package com.spring.annotations.javaconfig.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileJavaConfigTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("qa");
        ((AnnotationConfigApplicationContext)context).register(DevConfig.class,QAConfig.class);
        ((AnnotationConfigApplicationContext)context).refresh();

        Robot robot = context.getBean("robot", Robot.class);
        System.out.println(robot);


    }
}
