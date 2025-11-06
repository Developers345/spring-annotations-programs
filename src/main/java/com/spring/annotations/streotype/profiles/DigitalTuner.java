package com.spring.annotations.streotype.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Digital Source Code
@Component
@Profile("qa")
public class DigitalTuner implements ITuner{
    @Override
    public void tune(int frequency) {
        System.out.println("tune frequency"+" "+frequency);
    }
}
