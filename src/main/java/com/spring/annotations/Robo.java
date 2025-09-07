package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Robo {


    
    private Chip chip;
    private Sensor sensor;

    @Autowired
    @Qualifier("my-chip")
    public void setChip(Chip chip) {
        this.chip = chip;
    }



    /*public Robo()
     {
         System.out.println("no argument constructor");
     }*/

    /*@Autowired(required = false)
    public Robo(Chip chip) {
        this.chip = chip;
    }*/

    /*@Autowired(required = false)
    public void setChip(Chip chip) {
        System.out.println("setter");
        this.chip = chip;
    }*/

    /* @Autowired(required = false)
    public Robo(Sensor sensor) {
        this.sensor = sensor;
    }*/

   /* @Autowired(required = false)
    public Robo(Chip chip, Sensor sensor) {
        this.chip = chip;
        this.sensor = sensor;
    }*/

    @Override
    public String toString() {
        return "Robo{" +
                "chip=" + chip +
                '}';
    }
}
