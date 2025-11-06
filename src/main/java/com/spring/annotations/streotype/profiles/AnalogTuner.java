package com.spring.annotations.streotype.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Source Code Present
@Component
@Profile("dev")
public class AnalogTuner implements ITuner {
    @Override
    public void tune(int frequency) {
        System.out.println("tunning frequency"+" "+frequency);
    }
}
