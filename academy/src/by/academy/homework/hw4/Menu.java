package by.academy.homework.hw4;

import java.util.Scanner;

public class Menu {
	public void start(Scanner sc) {
		System.out.println("Menu:");
		System.out.println("1. Task1");
		System.out.println("2. Task2");
		System.out.println("0. Exit");
		String choose = sc.next();
		boolean repeat;
		do {
			repeat = false;
			switch (choose) {
			case "1":
				Task1Menu.menu(sc);
				choose = "";
				break;
			case "2":
				Task2Menu.menu(sc);
				choose = "";
				break;
			case "0":
				return;
			case "":
				start(sc);
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
