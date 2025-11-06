package com.spring.annotations.javaconfig.streotype.combination;

//No Source Code
public class Motor {

    private int capacity;
    private String type;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

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
