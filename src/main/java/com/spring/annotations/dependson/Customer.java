package com.spring.annotations.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    public Customer()
    {
        System.out.println("Customer object inilization");
    }
}
