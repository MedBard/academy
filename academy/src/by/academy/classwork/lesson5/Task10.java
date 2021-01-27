package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;

		System.out.println("enter k:");
		k = sc.nextInt();

		switch (Period(k)) {
		case 1:
			System.out.println("-10_000 - 0");
			break;
		case 2:
			System.out.println("0 - 5");
			break;
		case 3:
			System.out.println("5 - 10");
			break;
		case 4:
			System.out.println("10 - 10_000");
			break;
		default:
			System.out.println("oops");
			break;
		}

		sc.close();
	}

	public static int Period(int k) {
		if (k > -10_000 && k <= 0) {
			return 1;
		} else if (k > 0 && k <= 5) {
			return 2;
		} else if (k > 5 && k <= 10) {
			return 3;
		} else if (k > 10 && k <= 10_000) {
			return 4;
		} else {
			return 0;
		}
	}
}
