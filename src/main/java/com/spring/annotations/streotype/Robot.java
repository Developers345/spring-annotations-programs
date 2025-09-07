package com.spring.annotations.streotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Robot {

    private Chip chip;

    @Autowired
    public void setChip(Chip chip) {
        this.chip = chip;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "chip=" + chip +
                '}';
    }
}
