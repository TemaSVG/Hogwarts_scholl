package com.hogwarts.model;

import lombok.Getter;

@Getter
public class Puffendui extends Hogwarts {

    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffendui(int magicPower, int transgression, int hardWork, int loyalty, int honesty) {
        super(magicPower, transgression);
        this.hardWork = validateRange(hardWork);
        this.loyalty = validateRange(loyalty);
        this.honesty = validateRange(honesty);
    }

    private int validateRange(int value) {
        if (value < 0)
            return 0;
        if (value > 100)
            return 100;
        return value;
    }

    public int getFacultySum() {
        return hardWork + loyalty + honesty;
    }
}
