package com.spring.annotations.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("customer")
public class Account {

    public Account()
    {
        System.out.println("Account object initalization");
    }
}
