package com.hogwarts.model;

import lombok.Getter;

@Getter
public class Slizerin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slizerin(int magicPower, int transgression, int cunning, int determination,
            int ambition, int resourcefulness, int lustOfPower) {
        super(magicPower, transgression);
        this.cunning = validateRange(cunning);
        this.determination = validateRange(determination);
        this.ambition = validateRange(ambition);
        this.resourcefulness = validateRange(resourcefulness);
        this.lustOfPower = validateRange(lustOfPower);
    }

    private int validateRange(int value) {
        if (value < 0)
            return 0;
        if (value > 100)
            return 100;
        return value;
    }

    public int getFacultySum() {
        return cunning + determination + ambition + resourcefulness + lustOfPower;
    }
}
