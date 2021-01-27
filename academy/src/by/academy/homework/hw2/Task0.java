package by.academy.homework.hw2;

import java.util.Scanner;
import java.util.Random;

public class Task0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] array = new int[10];
		int target =0;

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);

		}
		
		System.out.println("Enter target:");
		target= sc.nextInt();
		
		sc.close();
	}
}
