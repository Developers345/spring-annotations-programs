package com.spring.annotations.javaconfig.importanno;
//No Source Code
public class BarChartViewer {

    private BarChart barChart;

    public void renderChart()
    {
        barChart.prepared();
        System.out.println("rendering the barchart data ");
    }

    public void setBarChart(BarChart barChart)
    {
        this.barChart = barChart;
    }
}
