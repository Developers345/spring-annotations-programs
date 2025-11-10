package com.spring.annotations.jcas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource("classpath:application_jcas.properties")
@ComponentScan(basePackages = {"com.spring.annotations.jcas"})
public class JCASConfig {

    @Autowired
    private Environment env;

    @Bean
    public Sensor sensor1()
    {
        Sensor sensor = new Sensor();
        sensor.setSensorType(env.getProperty("sensorType"));
        return sensor;
    }
    @Bean
    public Sensor sensor2()
    {
        Sensor sensor = new Sensor();
        sensor.setSensorType(env.getProperty("sensorType"));
        sensor.setFrequency(env.getProperty("frequency"));
        return sensor;
    }
}
