package by.academy.deal;

public class Fruit extends Product {
	public static int FRUIT_DISCOUNT = 5;

	String origin;
	int shelfLife;

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
		return 1;
	}
}
