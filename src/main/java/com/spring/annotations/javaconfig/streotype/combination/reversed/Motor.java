package com.spring.annotations.javaconfig.streotype.combination.reversed;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Source Code
@Component
public class Motor {

    private int capacity;
    private String type;

    @Value("${capacity}")
    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }

    @Value("${type}")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
