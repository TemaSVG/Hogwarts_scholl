package com.hogwarts;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hogwarts.model.*;
import com.hogwarts.service.*;

@SpringBootApplication
public class HogwartsApplication {

	public static void main(String[] args) {

		Student hermione = new Student("Гермиона Грейнджер",
				new Griffendor(100, 95, 5, 5, 6));

		Student ron = new Student("Рон Уизли",
				new Griffendor(80, 70, 3, 6, 5));

		Student harry = new Student("Гарри Поттер",
				new Griffendor(90, 85, 95, 100, 100));

		Student cedric = new Student("Седрик Диггори",
				new Puffendui(85, 80, 95, 100, 90));

		Student draco = new Student("Драко Малфой",
				new Slizerin(80, 75, 90, 85, 95, 80, 90));

		Student zacharias = new Student("Захария Смит",
				new Puffendui(70, 65, 85, 90, 80));

		Student luna = new Student("Луна Лавгуд",
				new Kogtevran(75, 70, 85, 90, 95, 100));

		System.out.println("=== ОПИСАНИЯ СТУДЕНТОВ ===\n");
		hermione.printDescription();
		ron.printDescription();
		harry.printDescription();

		System.out.println("=== СРАВНЕНИЕ СТУДЕНТОВ ОДНОГО ФАКУЛЬТЕТА ===\n");
		HogwartsService.compareGriffendor(hermione, ron);
		HogwartsService.compareGriffendor(hermione, harry);

		System.out.println("\n=== СРАВНЕНИЕ ПО МАГИИ И ТРАНСГРЕССИИ ===\n");
		HogwartsService.compareHogwarts(draco, zacharias);
		HogwartsService.compareHogwarts(hermione, luna);
	}
}
