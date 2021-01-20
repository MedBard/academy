package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		double sum = 0;
		int age = 0;
		int discount = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your sum: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine(); // clear the invalid input before prompting again
			System.out.print("Please enter your sum in numbers: ");
		}
		sum = sc.nextDouble();
		sc.nextLine();

		System.out.print("Please enter your age: ");
		while (!sc.hasNextInt()) {
			sc.nextLine(); // clear the invalid input before prompting again
			System.out.print("Please enter your age in number:");
		}
		age = sc.nextInt();

		if (sum <= 100) {
			discount = 5; /* Сумма до 100 рублей -> 5% */
		} else if ((sum < 200)) {
			discount = 7; /*
							 * Сумма от 100 рублей включая до 200 рублей не включая -> 7%
							 */
		} else if ((sum < 300)) {
			discount = 12; /*
							 * Сумма от 200 рублей включая до 300 рублей не включая -> 12%
							 */
			if (age >= 18) {
				discount += 4; /*
								 * возраст покупателя больше, чем 18 лет -> добавить 4% к скидке
								 */
			} else {
				discount += 3; /* иначе -> отнять 3%. */
			}
		} else if ((sum < 400)) {
			discount = 15; /*
							 * Сумма от 300 рублей включая до 400 рублей не включая -> 15%
							 */
		} else {
			discount = 20; /*
							 * Сумма покупки больше 400 рублей включая -> 20%
							 */
		}
		System.out.println(discount);
		System.out.println("Total price: " + ((sum * (100 - discount)) / 100));
		sc.close();
	}
}
