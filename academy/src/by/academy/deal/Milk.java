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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(fat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Milk))
			return false;
		Milk other = (Milk) obj;
		if (Double.doubleToLongBits(fat) != Double.doubleToLongBits(other.fat))
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		if (!other.equals(obj)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Milk [fat=" + fat + ", volume=" + volume + "price=" + super.getPrice() + ", quantity="
				+ super.getQuantity() + ", manufacturer=" + super.getManufacturer() + ", type=" + super.getType() + "]";
	}
}
