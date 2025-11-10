package com.spring.annotations.jcas;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

//Source Code Present
@Named
public class Robot {

    @Value("${robotType}")
    private String robotType;
    //@Inject
    //@Named("sensor2")
    /*
    Resources and @Inject both are same
     */
    @Resource(name = "sensor1")
    private Sensor sensor;


    public void setRobotType(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotType='" + robotType + '\'' +
                ", sensor=" + sensor +
                '}';
    }
}
