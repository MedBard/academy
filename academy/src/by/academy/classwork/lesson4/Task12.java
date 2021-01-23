package by.academy.classwork.lesson4;

public class Task12 {

	public static void main(String[] args) {
		int a = 13;
		int result = 1;

		for (int i = a; i < 100; i += a) {
			if (i % 2 == 1 && i % a == 0) {
				result *= i;
			}
		}
		System.out.println(result);
	}
}
