package by.academy.homework.hw4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Task1
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date(dd-MM-yyyy):");
		String gDate = sc.next();
		Date date1 = new Date(gDate, sc);
		System.out.print("Enter next date(dd-MM-yyyy):");
		gDate = sc.next();
		Date date2 = new Date(gDate, sc);
		date1.printDate();
		date1.dayOfWeek();
		Date.countDays(date1, date2);
		date1.checkYear();

		// Task2
		Integer i1 = 11;
		Integer i2 = 12;
		Integer i3 = 13;
		Integer i4 = 14;
		Integer i5 = 15;

		Gen<Integer> g = new Gen<Integer>();
		g.add(i1);
		g.add(i2);
		g.add(i3);
		g.add(i4);
		g.add(i5);
		System.out.println("Array " + g.toString());
		System.out.println("Size " + g.getArraySize());
		System.out.println("Last filling index " + g.getLastFilling());
		System.out.println("Get by index 2 " + g.get(2));
		System.out.println("First element " + g.getFirst());
		System.out.println("Last element " + g.getLast());
		g.remove(0);
		System.out.println("Array after remove " + g.toString());
		g.remove(i5);
		;
		System.out.println("Array after remove " + g.toString());
	}
}
