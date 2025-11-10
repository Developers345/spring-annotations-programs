package com.spring.annotations.jcas;

//No Source Code
public class Sensor {

    private String sensorType;
    private String frequency;

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "sensorType='" + sensorType + '\'' +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
