package by.academy.homework1;

public class Task4 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 0;; ++i) {
			result = (int) Math.pow(2, i);
			if(result > 1_000_000) {
				break;
			}
			System.out.println("2 ^ " + i + " = " + result);
		}

	}

}
