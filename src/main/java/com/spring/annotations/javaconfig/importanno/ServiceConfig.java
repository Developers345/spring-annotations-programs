package com.spring.annotations.javaconfig.importanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public BarChart barChart()
    {
        BarChart barChart = new BarChart();
        return barChart;
    }
}
