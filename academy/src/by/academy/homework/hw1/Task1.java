package by.academy.homework.hw1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		double sum = 0;
		int age = 0;
		float discount = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your sum: ");
		while (!sc.hasNextDouble()) { // check for invalid type of sum
			sc.nextLine();
			System.out.print("Please enter your sum in numbers: ");
		}
		sum = sc.nextDouble();
		sc.nextLine();

		System.out.print("Please enter your age: ");
		while (!sc.hasNextInt()) { // check for invalid type of age
			sc.nextLine();
			System.out.print("Please enter your age in number:");
		}
		age = sc.nextInt();

		if (sum < 0) {
			System.out.println("Sum < 0!");
		} else if (sum >= 400) {
			discount = 20;
		} else if ((sum >= 300)) {
			discount = 15;
		} else if ((sum >= 200)) {
			discount = 12;
			if (age >= 18) {
				discount += 4;
			} else {
				discount += 3;
			}
		} else if ((sum >= 100)) {
			discount = 7;
		} else {
			discount = 5;
		}
		
		// Print result without discount
		System.out.println("Total price: " + ((sum * (100 - discount)) / 100));
		sc.close();
	}
}
