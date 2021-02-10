package by.academy.deal;

public abstract class Product {
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

	public double calcFinalPrice() {
		return price * (1 - (double) discount() / 100);
	}

	public abstract int discount();

}
