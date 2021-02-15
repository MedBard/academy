package by.academy.deal;

import java.util.Scanner;

public class Milk extends Product {
	public static int MILK_DISCOUNT = 30;

	public Milk() {
		super();
	}

	public Milk(double price, String type, String manufacturer, int quantity) {
		super(price, type, manufacturer, quantity);
	}

	public Milk(double price, String type, String manufacturer, int quantity, double fat, double volume) {
		super(price, type, manufacturer, quantity);
		this.fat = fat;
		this.volume = volume;
	}

	double fat;
	double volume;

	public double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	@Override
	public int discount() {
		if (fat > 2) {
			return MILK_DISCOUNT;
		}
		return 0;
	}
	
	public Milk createMilk(Scanner sc) {
		System.out.println("Enter price");
		this.setPrice(sc.nextDouble());
		System.out.println("Enter name of product");
		this.setType(sc.next());
		System.out.println("Enter manufacturer");
		this.setManufacturer(sc.next());
		System.out.println("Enter quantity");
		this.setQuantity(sc.nextInt());
		System.out.println("Enter fat of milk");
		this.setFat(sc.nextDouble());
		System.out.println("Enter volume of bottle");
		this.setVolume(sc.nextDouble());
		return this;
	}
}
