package com.spring.annotations.streotype;

import com.spring.annotations.Robo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StreoTypeAnnotationTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-streotype-context.xml");
        Employee emp = context.getBean("employee",Employee.class);
        Robot robot = context.getBean("robot",Robot.class);
        System.out.println(robot);

        Robot robot1 = context.getBean("robot",Robot.class);
        System.out.println("robot=robot1?"+(robot == robot1));

    }
}
