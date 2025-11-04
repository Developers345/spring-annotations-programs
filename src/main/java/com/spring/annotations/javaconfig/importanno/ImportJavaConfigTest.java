package com.spring.annotations.javaconfig.importanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportJavaConfigTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        BarChartViewer barChartViewer = context.getBean("barChartViewer", BarChartViewer.class);
        barChartViewer.renderChart();
    }
}
