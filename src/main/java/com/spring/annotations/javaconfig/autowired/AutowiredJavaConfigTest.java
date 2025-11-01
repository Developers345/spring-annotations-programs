package com.spring.annotations.javaconfig.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredJavaConfigTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AutowiredJavaConfig.class);
        Launcher launcher = context.getBean("launcher", Launcher.class);
        launcher.launch();
    }
}
