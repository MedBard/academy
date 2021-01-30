package by.academy.homework.hw2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1;
		String text2;
		int[] compare = new int[256];
		boolean check = true;

		System.out.println("Enter 2 strings to compare:");
		text1 = sc.next();
		text2 = sc.next();

		if (text1.length() == text2.length()) {
			for (int i = 0; i < text1.length(); i++) {
				compare[text1.charAt(i)]++;
				compare[text2.charAt(i)]--;
			}
		} else {
			System.out.println("Different lenght of strings!");
			check = false;
		}
		for (int i = 0; i < compare.length; i++) {
			if (compare[i] != 0) {
				System.out.println("Strings are different");
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("String are equals");
		}
		sc.close();
	}
}
