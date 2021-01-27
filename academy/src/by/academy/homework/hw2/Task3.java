package by.academy.homework.hw2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1;
		String text2;

		System.out.println("Enter 2 words:");
		text1 = sc.next();
		text2 = sc.next();

		if (text1.length() % 2 == 0 && text2.length() % 2 == 0) {
			for (int i = 0; i < text1.length() / 2; i++) {
				System.out.print(text1.charAt(i));
			}
			for (int i = text2.length() / 2; i < text2.length(); i++) {
				System.out.print(text2.charAt(i));
			}
		} else {
			System.out.println("Incorrect words!");
		}
		sc.close();
	}
}
