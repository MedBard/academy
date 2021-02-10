package by.academy.deal;

public class Vegetables extends Product {
	public static int VEGETABLE_DISCOUNT = 10;

	String origin;

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
}
