package com.spring.annotations.javaconfig.dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DependsOnConfig {
    @Bean
    @DependsOn("signalTower")
    public Rocket rocket()
    {
        Rocket rocket = new Rocket();
        return rocket;
    }

    @Bean
    public SignalTower signalTower()
    {
        SignalTower signalTower = new SignalTower();
        return signalTower;
    }
}
