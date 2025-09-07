package com.spring.annotations.streotype;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Employee {

    public Employee()
    {
        System.out.println("Employee object initalized");
    }
}
