package com.spring.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sensor.properties")
public class Sensor {

    Environment environment;

    //@Value("${sensorId}")
    @Value("#{environment.sensorId}")
    private String sensorId;
    //@Value("${sensorType}")
    @Value("#{environment.sensorType}")
    private String sensorType;

    @Override
    public String toString() {
        return "Sensor{" +
                "sensorId='" + sensorId + '\'' +
                ", sensorType='" + sensorType + '\'' +
                '}';
    }
}
