package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		double s;
		int percent = 3;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sum:");
		s = sc.nextDouble();
		System.out.println("Enter term:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			s += (s * percent * 0.01);
		}
		System.out.println(s);
		sc.close();
	}
}
