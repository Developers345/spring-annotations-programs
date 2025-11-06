package com.spring.annotations.streotype.profiles;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app_qa.properties")
@ComponentScan(basePackages = {"com.spring.annotations.streotype.profiles"})
@Profile("qa")
public class JavaConfigQA {
}
