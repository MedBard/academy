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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Vegetables))
			return false;
		Vegetables other = (Vegetables) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (!other.equals(obj)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Vegetables [origin=" + origin + "price=" + super.getPrice() + ", quantity=" + super.getQuantity()
				+ ", manufacturer=" + super.getManufacturer() + ", type=" + super.getType() + "]";
	}
}
