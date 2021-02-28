package by.academy.homework.hw4;

import java.util.Scanner;

public class Task1Menu {
	public static void menu(Scanner sc) {
		final String menuStr = "Menu Task1: \n1. Print Dates \n2. Day Of Week \n3. Days Between "
				+ "\n4. Check Year For Leap \n5. Exit";

		System.out.print("Enter first date(dd-MM-yyyy):");
		String gDate = sc.next();
		Date date1 = new Date(gDate, sc);

		System.out.println(menuStr);
		String choose = sc.next();
		boolean repeat;
		do {
			repeat = false;
			switch (choose) {
			case "1":
				date1.printDate();
				break;
			case "2":
				date1.dayOfWeek();
				break;
			case "3":
				System.out.print("Enter second date(dd-MM-yyyy):");
				gDate = sc.next();
				Date date2 = new Date(gDate, sc);
				Date.countDays(date1, date2);
				break;
			case "4":
				date1.checkYear();
				break;
			case "5":
				return;
			default:
				System.out.print("Choose correct variant:");
				choose = sc.next();
				repeat = true;
				break;
			}
		} while (repeat);
	}
}
