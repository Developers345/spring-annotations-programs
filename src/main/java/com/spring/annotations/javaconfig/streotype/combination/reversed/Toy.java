package com.spring.annotations.javaconfig.streotype.combination.reversed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//No Source Code Present
public class Toy {

    private String toyName;
    private Motor motor;


    public void setToyName(String toyName) {
        this.toyName = toyName;
    }


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
