package com.spring.annotations.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("automaticRobo")
public class AutomaticRobo {

    private Sensor sensor;

    @Autowired
    public void setSensor(Sensor sensor)
    {
        this.sensor = sensor;
    }


    @Override
    public String toString() {
        return "AutomaticRobo{" +
                "sensor=" + sensor +
                '}';
    }
}
