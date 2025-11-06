package com.spring.annotations.javaconfig.streotype.combination.reversed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:streo_java_config.properties")
@ComponentScan(basePackages = {"com.spring.annotations.javaconfig.streotype.combination.reversed"})
public class StreoJavaComConfig {

    @Autowired
    private Environment env;

    @Bean
    public Toy toy(Motor motor)
    {
        Toy toy = new Toy();
        toy.setToyName(env.getProperty("toyName"));
        toy.setMotor(motor);
        return toy;

    }
}
