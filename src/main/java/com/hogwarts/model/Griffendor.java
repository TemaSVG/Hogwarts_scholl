package com.hogwarts.model;

import lombok.Getter;

@Getter
public class Griffendor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffendor(int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(magicPower, transgression);
        this.nobility = validateRange(nobility);
        this.honor = validateRange(honor);
        this.bravery = validateRange(bravery);
    }

    private int validateRange(int value) {
        if (value < 0)
            return 0;
        if (value > 100)
            return 100;
        return value;
    }

    public int getFacultySum() {
        return nobility + honor + bravery;
    }
}
