package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int num;
		long result = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		num = sc.nextInt();
		for (; num > 1; num--) {
			result *=num;
		}
		System.out.println(result);
		sc.close();
	}
}
