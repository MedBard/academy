package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		int b = 0;
		double result = 1;

		System.out.println("Enter a:");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			System.out.println("Enter b:");
			b = sc.nextInt();
		} else {
			a = sc.nextDouble();
			System.out.println("Enter b(must be positive):");
			b = sc.nextInt();
		}

		if (b > 0) {
			for (int i = 0; i < b; i++) {
				result *= a;
			}
		} else {
			for (int i = 0; i > b; i--) {
				result /= a;
			}
		}
		System.out.println(result);
	}
}
