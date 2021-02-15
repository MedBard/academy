package by.academy.deal;

import java.util.Scanner;

public class Vegetables extends Product {
	public static int VEGETABLE_DISCOUNT = 10;

	String origin;

	public Vegetables() {
		super();
	}

	public Vegetables(double price, String type, String manufacturer, int quantity, String origin) {
		super(price, type, manufacturer, quantity);
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public int discount() {
		if (origin.equals("BLR")) {
			return VEGETABLE_DISCOUNT;
		}
		return 0;
	}

	public Vegetables createVegetable(Scanner sc) {
		System.out.println("Enter price");
		this.setPrice(sc.nextDouble());
		System.out.println("Enter name of product");
		this.setType(sc.next());
		System.out.println("Enter manufacturer");
		this.setManufacturer(sc.next());
		System.out.println("Enter quantity");
		this.setQuantity(sc.nextInt());
		System.out.println("Enter counry of origin");
		this.setOrigin(sc.next());
		return this;
	}
}
