package com.spring.annotations.javaconfig.blc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//No Source Code
public class Calculator {

    private int a;
    private int b;
    private int sum;

    public Calculator(@Value("${a}") int a)
    {
        this.a = a;

    }


    public void setB(int b) {

        this.b = b;
    }


    public void init()
    {
        System.out.println("init");
        this.sum = this.a + this.b;
    }


    public void close()
    {
        System.out.println("close()");
        this.sum = 0;
    }
    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                ", sum=" + sum +
                '}';
    }
}
