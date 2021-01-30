package by.academy.homework.hw1;

public class Task4 {

	public static void main(String[] args) {
		int result = 0;
		int j = 0;

		do {
			result = (int) Math.pow(2, j);
			System.out.println("2 ^ " + j + " = " + result);
			j++;
		} while (result < 1_000_000);
		System.out.println("end");
//		for (int i = 0;; ++i) {
//			result = (int) Math.pow(2, i);
//			if(result > 1_000_000) {
//				break;
//			}
//			System.out.println("2 ^ " + i + " = " + result);
//		}

	}
}
