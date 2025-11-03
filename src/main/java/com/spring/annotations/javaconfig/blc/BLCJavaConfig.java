package com.spring.annotations.javaconfig.blc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application_javaconfig_blc.properties")
public class BLCJavaConfig {

    @Autowired
    private Environment env;

    @Bean(initMethod = "init", destroyMethod = "close")
    public Calculator calculator()
    {
        Calculator calculator = new Calculator(Integer.parseInt(env.getProperty("a")));
        calculator.setB(Integer.parseInt(env.getProperty("b")));
        return calculator;
    }
}
