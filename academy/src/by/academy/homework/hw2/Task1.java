package by.academy.homework.hw2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1;
		String text2;
		boolean check = false;

		System.out.println("Enter 2 rows to compare:");
		text1 = sc.next();
		text2 = sc.next();

		for (int i = 0; i < text1.length(); i++) {
			for (int j = 0; j < text2.length(); j++) {
				if (text1.charAt(i) == text2.charAt(j)) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
			if (!check) {
				System.out.println("Check unsucssessfull");
				break;
			}
		}

		if (check) {
			System.out.println("Check sucssessfull");
		}
		sc.close();
	}
}
