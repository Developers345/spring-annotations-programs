package com.spring.annotations.streotype.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Source Code Present
@Component
public class Radio {

    @Value("${bandType}")
    private String bandType;
    @Value("${frequencyRange}")
    private String frequencyRange;

    private ITuner tuner;


    @Autowired
    public void setTuner(ITuner tuner) {
        this.tuner = tuner;
    }

     public void on(int frequency)
     {
         tuner.tune(frequency);
         System.out.println("Listening...");
     }

    @Override
    public String toString() {
        return "Radio{" +
                "bandType='" + bandType + '\'' +
                ", frequencyRange=" + frequencyRange +
                ", tuner=" + tuner +
                '}';
    }
}
