package com.spring.annotations.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Vehicle newVehicle()
    {
        return new Vehicle();
    }
}
