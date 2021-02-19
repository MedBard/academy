package by.academy.deal;

import java.util.Scanner;

public class Fruit extends Product {
	public static int FRUIT_DISCOUNT = 5;

	private String origin;
	private int shelfLife;

	public Fruit() {
		super();
	}

	public Fruit(double price, String type, String manufacturer, int quantity, String origin, int shelfLife) {
		super(price, type, manufacturer, quantity);
		this.origin = origin;
		this.shelfLife = shelfLife;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}

	@Override
	public int discount() {
		if (shelfLife > 10) {
			return FRUIT_DISCOUNT;
		}
		return 0;
	}

	public Fruit createFruit(Scanner sc) {
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
		System.out.println("Enter shelf life");
		this.setShelfLife(sc.nextInt());
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + shelfLife;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Fruit))
			return false;
		Fruit other = (Fruit) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (shelfLife != other.shelfLife)
			return false;
		if (!other.equals(obj)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Fruit [origin=" + origin + ", shelfLife=" + shelfLife + "price=" + super.getPrice() + ", quantity="
				+ super.getQuantity() + ", manufacturer=" + super.getManufacturer() + ", type=" + super.getType() + "]";
	}
}
