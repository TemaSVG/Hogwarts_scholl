package com.hogwarts.model;

import lombok.Getter;

@Getter
public class Kogtevran extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(int magicPower, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(magicPower, transgression);
        this.mind = validateRange(mind);
        this.wisdom = validateRange(wisdom);
        this.wit = validateRange(wit);
        this.creativity = validateRange(creativity);
    }

    private int validateRange(int value) {
        if (value < 0)
            return 0;
        if (value > 100)
            return 100;
        return value;
    }

    public int getFacultySum() {
        return mind + wisdom + wit + creativity;
    }
}
