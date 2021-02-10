package by.academy.deal;

public class Deal {
	public final static int DEFAULT_PRODUCT_SIZE = 3;

	String date;
	Person seller;
	Person buyer;
	Product[] products;
	int productCounter;

	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person buyer) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	public void deleteProduct(int index) {
		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	private void printBill() {
		double summ = 0;
		System.out.println("Bill " + date);
		System.out.println();
		for (Product product : products) {
			if (product != null) {
				double totalProductPrice = product.calcPrice();
				summ += totalProductPrice;
				System.out.println(product.getType() + " "
						+ product.getPrice() * (1 - (double) product.discount() / 100) + " X " + product.getQuantity()
						+ " = " + totalProductPrice + "(Discount " + product.discount() + "%)");
			}
		}
		System.out.println();
		System.out.println("Total " + summ);
		buyer.setMoney(buyer.getMoney() - summ);
		seller.setMoney(seller.getMoney() + summ);
	}

	public void printProducts() {
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			System.out.println("Name: " + p.getType());
			System.out.println("Manufacturer: " + p.getManufacturer());
			System.out.println("Total Price: " + p.calcPrice());
			System.out.println("-----------------");
		}
	}

	public void deal() {
		double sum = 0;
		for (Product product : products) {
			if (product != null) {
				sum += product.getPrice() * product.getQuantity();
			}
		}
		if (sum > buyer.getMoney()) {
			System.out.println("Not enought money! ");
		} else {
			printBill();
		}
	}
}
