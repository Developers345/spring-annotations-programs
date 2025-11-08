package com.spring.annotations.javaconfig.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application_jc_profiles_qa.properties")
@ComponentScan(basePackages = {"com.spring.annotations.javaconfig.profiles"})
@Profile("qa") // Here you tell to ioc container this configuration belongs to which env
public class QAConfig {

    @Autowired
    private Environment env;

    @Autowired
    @Qualifier("termnalSensorImpl")
    private ISensor sensor;

    @Bean
    public Robot robot()
    {
        Robot robot = new Robot();
        robot.setRobotType(env.getProperty("robotType"));
        robot.setVersion(Integer.parseInt(env.getProperty("version")));
        robot.setSensor(sensor);
        return robot;

    }
}
