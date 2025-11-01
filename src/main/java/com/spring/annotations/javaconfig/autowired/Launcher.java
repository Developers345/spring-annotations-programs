package com.spring.annotations.javaconfig.autowired;
//no source code
public class Launcher {

    private Rocket rocket;

    public void launch()
    {
        rocket.ignite();
        System.out.println("Launched");
    }

    public void setRocket(Rocket rocket)
    {
        this.rocket=rocket;
    }
}
