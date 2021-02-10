package by.academy.deal;

public class Milk extends Product {
	public static int MILK_DISCOUNT = 30;

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
}
