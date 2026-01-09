package com.hogwarts.model;

import lombok.Getter;

@Getter
public class Student {

    private String name;
    private Hogwarts hogwarts;

    public Student(String name, Griffendor griffendor) {
        this.name = name;
        this.hogwarts = griffendor;
    }

    public Student(String name, Puffendui puffendui) {
        this.name = name;
        this.hogwarts = puffendui;
    }

    public Student(String name, Slizerin slizerin) {
        this.name = name;
        this.hogwarts = slizerin;
    }

    public Student(String name, Kogtevran kogtevran) {
        this.name = name;
        this.hogwarts = kogtevran;
    }

    public void printDescription() {
        System.out.println("=== " + name + " ===");
        System.out.println("Общие качества Хогвартса:");
        System.out.println("  Сила магии: " + hogwarts.getMagicPower());
        System.out.println("  Трансгрессия: " + hogwarts.getTransgression());

        if (hogwarts instanceof Griffendor) {
            Griffendor g = (Griffendor) hogwarts;
            System.out.println("Качества Гриффиндора:");
            System.out.println("  Благородство: " + g.getNobility());
            System.out.println("  Честь: " + g.getHonor());
            System.out.println("  Храбрость: " + g.getBravery());
        } else if (hogwarts instanceof Puffendui) {
            Puffendui p = (Puffendui) hogwarts;
            System.out.println("Качества Пуффендуя:");
            System.out.println("  Трудолюбие: " + p.getHardWork());
            System.out.println("  Верность: " + p.getLoyalty());
            System.out.println("  Честность: " + p.getHonesty());
        } else if (hogwarts instanceof Slizerin) {
            Slizerin s = (Slizerin) hogwarts;
            System.out.println("Качества Слизерина:");
            System.out.println("  Хитрость: " + s.getCunning());
            System.out.println("  Решительность: " + s.getDetermination());
            System.out.println("  Амбициозность: " + s.getAmbition());
            System.out.println("  Находчивость: " + s.getResourcefulness());
            System.out.println("  Жажда власти: " + s.getLustOfPower());
        } else if (hogwarts instanceof Kogtevran) {
            Kogtevran k = (Kogtevran) hogwarts;
            System.out.println("Качества Когтеврана:");
            System.out.println("  Ум: " + k.getMind());
            System.out.println("  Мудрость: " + k.getWisdom());
            System.out.println("  Остроумие: " + k.getWit());
            System.out.println("  Творчество: " + k.getCreativity());
        }
        System.out.println();
    }
}
