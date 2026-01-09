package com.hogwarts.service;

import org.springframework.stereotype.Service;
import com.hogwarts.model.*;

@Service
public class HogwartsService {

    public static void compareGriffendor(Student student1, Student student2) {
        if (!(student1.getHogwarts() instanceof Griffendor) ||
                !(student2.getHogwarts() instanceof Griffendor)) {
            System.out.println("Оба студента должны быть из Гриффиндора!");
            return;
        }

        Griffendor g1 = (Griffendor) student1.getHogwarts();
        Griffendor g2 = (Griffendor) student2.getHogwarts();

        int sum1 = g1.getFacultySum();
        int sum2 = g2.getFacultySum();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Гриффиндора");
        }
    }

    public static void comparePuffendui(Student student1, Student student2) {
        if (!(student1.getHogwarts() instanceof Puffendui) ||
                !(student2.getHogwarts() instanceof Puffendui)) {
            System.out.println("Оба студента должны быть из Пуффендуя!");
            return;
        }

        Puffendui p1 = (Puffendui) student1.getHogwarts();
        Puffendui p2 = (Puffendui) student2.getHogwarts();

        int sum1 = p1.getFacultySum();
        int sum2 = p2.getFacultySum();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Пуффендуя");
        }
    }

    public static void compareSlizerin(Student student1, Student student2) {
        if (!(student1.getHogwarts() instanceof Slizerin) ||
                !(student2.getHogwarts() instanceof Slizerin)) {
            System.out.println("Оба студента должны быть из Слизерина!");
            return;
        }

        Slizerin s1 = (Slizerin) student1.getHogwarts();
        Slizerin s2 = (Slizerin) student2.getHogwarts();

        int sum1 = s1.getFacultySum();
        int sum2 = s2.getFacultySum();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Слизерина");
        }
    }

    public static void compareKogtevran(Student student1, Student student2) {
        if (!(student1.getHogwarts() instanceof Kogtevran) ||
                !(student2.getHogwarts() instanceof Kogtevran)) {
            System.out.println("Оба студента должны быть из Когтеврана!");
            return;
        }

        Kogtevran k1 = (Kogtevran) student1.getHogwarts();
        Kogtevran k2 = (Kogtevran) student2.getHogwarts();

        int sum1 = k1.getFacultySum();
        int sum2 = k2.getFacultySum();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Когтеврана");
        }
    }

    public static void compareHogwarts(Student student1, Student student2) {
        Hogwarts h1 = student1.getHogwarts();
        Hogwarts h2 = student2.getHogwarts();

        int magic1 = h1.getMagicPower();
        int magic2 = h2.getMagicPower();
        int trans1 = h1.getTransgression();
        int trans2 = h2.getTransgression();

        if (magic1 > magic2) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (magic2 > magic1) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " обладают равной мощностью магии");
        }

        if (trans1 > trans2) {
            System.out.println(
                    student1.getName() + " обладает большим расстоянием трансгрессии, чем " + student2.getName());
        } else if (trans2 > trans1) {
            System.out.println(
                    student2.getName() + " обладает большим расстоянием трансгрессии, чем " + student1.getName());
        } else {
            System.out.println(
                    student1.getName() + " и " + student2.getName() + " обладают равным расстоянием трансгрессии");
        }
    }
}
