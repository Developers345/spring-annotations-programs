package com.spring.annotations.javaconfig.streotype.combination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:streo_java_config.properties")
@ComponentScan(basePackages = {"com.spring.annotations.javaconfig.streotype.combination"})
public class StreoJavaComConfig {
    @Autowired
    private Environment env;
    @Bean
    public Motor motor()
    {
        Motor motor = new Motor();

        motor.setCapacity(Integer.parseInt(env.getProperty("capacity")));
        motor.setType(env.getProperty("type"));
        return motor;
    }
}
