package by.academy.homework.hw1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Print num:");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Please enter your number correctly:");
			}
			num = sc.nextInt();
			System.out.println("Please enter your number correctly(1-10):");
		} while (num < 0 || num > 10);

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);

		}
		sc.close();
	}
}
