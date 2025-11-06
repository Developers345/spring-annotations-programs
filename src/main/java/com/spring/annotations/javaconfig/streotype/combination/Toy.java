package com.spring.annotations.javaconfig.streotype.combination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Source Code Present
@Component
public class Toy {

    private String toyName;
    private Motor motor;

    @Value("${toyName}")
    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                ", motor=" + motor +
                '}';
    }
}
