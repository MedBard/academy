package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int iMin = 0;
		int iMax = 0;

		System.out.println("how much strings?");
		count = sc.nextInt();
		String[] array = new String[count];
		int[] arrLenght = new int[count];

		System.out.println("enter strings:");
		for (int i = 0; i < count; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < count; i++) {
			arrLenght[i] = array[i].length();
		}

		for (int i = 1; i < count; i++) {
			if (arrLenght[i] < arrLenght[iMin]) {
				iMin = i;
			} else if (arrLenght[i] > arrLenght[iMax]) {
				iMax = i;
			}
		}
		System.out.println("Min lenght " + arrLenght[iMin]);
		System.out.println("Min string " + array[iMin]);
		System.out.println("Min lenght " + arrLenght[iMax]);
		System.out.println("Min string " + array[iMax]);

		sc.close();
	}
}
