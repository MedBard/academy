package by.academy.homework.hw4;

import java.util.Scanner;

public class Task2Menu {
	public static void menu(Scanner sc) {
		final String menuStr = "Menu Task2: \n1. Print Array \n2. Array Size \n3. Last Filling Index "
				+ "\n4. Get By Index \n5. First Element \n6. Last Element \n7."
				+ " Remove By Index\n8. Remove Element\n9. Add Element\n0. Exit";
		Gen<Integer> g = new Gen<Integer>();
		g.add(11);
		g.add(12);
		g.add(13);
		g.add(14);
		g.add(15);

		System.out.println(menuStr);
		String choose = sc.next();
		boolean repeat = true;
		while (repeat) {
			switch (choose) {
			case "1":
				System.out.println("Array " + g.toString());
				choose = "";
				break;
			case "2":
				System.out.println("Size " + g.getArraySize());
				choose = "";
				break;
			case "3":
				System.out.println("Last filling index " + g.getLastFilling());
				choose = "";
				break;
			case "4":
				System.out.print("Index:");
				int index = sc.nextInt();
				System.out.println("Get by index " + index + " " + g.get(index));
				choose = "";
				break;
			case "5":
				System.out.println("First element " + g.getFirst());
				choose = "";
				break;
			case "6":
				System.out.println("Last element " + g.getLast());
				choose = "";
				break;
			case "7":
				System.out.print("Index:");
				g.remove(sc.nextInt());
				System.out.println("Array after remove " + g.toString());
				choose = "";
				break;
			case "8":
				System.out.print("Element:");
				g.remove(sc.nextInt());
				System.out.println("Array after remove " + g.toString());
				choose = "";
				break;
			case "9":
				System.out.print("Element:");
				g.add(sc.nextInt());
				System.out.println("Array after add " + g.toString());
				choose = "";
				break;
			case "0":
				repeat = false;
				return;
			case "":
				System.out.println(menuStr);
				choose = sc.next();
				break;
			default:
				System.out.print("Choose correct variant:");
				choose = sc.next();
				break;
			}
		}
	}

	public void menuTask3(Scanner sc) {

	}
}
