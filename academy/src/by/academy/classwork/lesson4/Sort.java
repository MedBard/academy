package by.academy.classwork.lesson4;

import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		int[] array = new int[10];

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			System.out.println(array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			int tmp;
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("  " + array[i]);
		}
	}

}
