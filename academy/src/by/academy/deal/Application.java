package by.academy.deal;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
//		Person seller = new Person();
//		Person buyer = new Person();
//		DealDate date = new DealDate();
		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone number:");
		if (apv.validate(sc.next())) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
//		System.out.print("Enter date(dd/MM/yyyy or dd-MM-yyyy ):");
//		date.setDate(sc.next());
//		
//		System.out.println(date.checkDate());
//		date.printDate();
//		
//		System.out.println(date.checkDate());
//		System.out.print("Enter buyer(name money):");
//		buyer.setName(sc.next("[a-zA-Z]+"));
//		buyer.setMoney(sc.nextDouble());
//		System.out.print("Enter seller(name money):");
//		seller.setName(sc.next("[a-zA-Z]+"));
//		seller.setMoney(sc.nextDouble());

		Person seller = new Person("Vasya", 2000.00);
		Person buyer = new Person("Petya", 3000.00);

		Deal deal = new Deal("10-02-2021", seller, buyer);

		deal.addProduct(new Vegetables(50, "Carrot", "AgroHolding", 5, "BLR"));
		deal.addProduct(new Milk(80, "Milk", "Cow", 10, 2.5, 1.0));
		deal.addProduct(new Fruit(80, "Orange", "BananaInc", 5, "ECU", 25));

		deal.deal();
		sc.close();
	}
}
