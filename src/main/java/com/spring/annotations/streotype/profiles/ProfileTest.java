package com.spring.annotations.streotype.profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("dev");
        ((AnnotationConfigApplicationContext)context).register(JavaConfigDev.class);
        ((AnnotationConfigApplicationContext)context).register(JavaConfigQA.class);
        //After register will not read the configuration it just holds the reference objects of jav config classes
        ((AnnotationConfigApplicationContext)context).refresh();//once refresh happen then only read the configuration


         Radio radio = context.getBean("radio", Radio.class);

        radio.on(98);
        System.out.println(radio);






    }


}
