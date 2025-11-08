package com.spring.annotations.javaconfig.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//Source Code Present
@Component
@Qualifier("termnalSensorImpl")
//@Profile("qa")// you need to tell ioc container use for dev env
public class TermnalSensorImpl implements ISensor{

    @Value("${heatDetection}")
    private int heatDetection;
    @PostConstruct
    @Override
    public void init() {
        System.out.println("TermnalSensor initalized");
    }
}
