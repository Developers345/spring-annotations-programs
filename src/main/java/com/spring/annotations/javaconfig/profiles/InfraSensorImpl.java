package com.spring.annotations.javaconfig.profiles;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//Source Code Present
@Component
@Qualifier("infraSensorImpl")
//@Profile("dev") // you need to tell ioc container use for dev env
public class InfraSensorImpl implements ISensor{

    @Value("${range}")
    private int range;
    @PostConstruct
    @Override
    public void init() {
        System.out.println("InfraSensor initialized");
    }
}
