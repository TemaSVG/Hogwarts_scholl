package com.hogwarts.model;

import lombok.Getter;

@Getter
public class Hogwarts {

    private int magicPower;
    private int transgression;

    public Hogwarts(int magicPower, int transgression) {
        this.magicPower = validateRange(magicPower);
        this.transgression = validateRange(transgression);
    }

    private int validateRange(int value) {
        if (value < 0)
            return 0;
        if (value > 100)
            return 100;
        return value;
    }
}
