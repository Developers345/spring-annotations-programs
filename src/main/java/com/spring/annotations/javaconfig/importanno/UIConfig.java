package com.spring.annotations.javaconfig.importanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UIConfig {

    @Bean
    public BarChartViewer barChartViewer(BarChart barChart)
    {
        BarChartViewer barChartViewer = new BarChartViewer();
        barChartViewer.setBarChart(barChart);
        return barChartViewer;

    }

}
