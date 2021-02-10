package by.academy.deal;

public class Product {
	public static int DEFAULT_DISCOUNT = 10;

	double price;
	int quantity;
	String manufacturer;
	String type;

	public Product() {
		super();
	}

	public Product(double price, String type, String manufacturer, int quantity) {
		super();
		this.price = price;
		this.type = type;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public final double calcPrice() {
		return quantity * price * (1 - (double) discount() / 100);
	}

	public int discount() {
		if (quantity > 10) {
			return DEFAULT_DISCOUNT;
		}
		return 1;
	};

}
