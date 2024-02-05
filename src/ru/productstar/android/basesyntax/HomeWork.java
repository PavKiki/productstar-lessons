package ru.productstar.android.basesyntax;

import java.util.*;

public class HomeWork {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println("Расскажите о вашем друге");
			
			System.out.println("Как зовут вашего друга");
			var name = scanner.nextLine();
			
			System.out.println("Сколько лет вашему другу");
			var age = scanner.nextInt();
			
			System.out.println("Моему другу " + name + " на данный момент " + age + " лет");
		} catch (Exception e) {
			System.out.println("Something went wrong!\n" + e.getLocalizedMessage());
		}
	}
}