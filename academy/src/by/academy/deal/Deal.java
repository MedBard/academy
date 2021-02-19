package by.academy.deal;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Deal {
	public final static int DEFAULT_PRODUCT_SIZE = 3;
	static final String MAIN_MENU_OUTPUT = "1: Add product \n2: Delete product \n3: Info \n0: Exit";
	static final String PRODUCT_MENU = "Choose product: \n1: Add Vegetables \n2: Add Milk \n3: Add Fruit \n0: Exit";

	private Date date;
	private Person seller;
	private Person buyer;
	private Product[] products;
	private int productCounter = 0;
	private LocalDate deadLine;

	public Deal() {
		super();
	}

	public Deal(Date date, Person seller, Person buyer, Product[] products, LocalDate deadLine) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		this.deadLine = deadLine;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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

	public LocalDate getDeadLine() {
		return deadLine;
	}

	public void setDeadLine() {
		this.deadLine = LocalDate.now();
		this.deadLine.plusDays(10);
	}

	public void dealMenu(Scanner sc) {
		System.out.println(MAIN_MENU_OUTPUT);
		int tmp = sc.nextInt();
		switch (tmp) {
		case 1:
			productChoose(sc);
			break;
		case 2:
			System.out.println("Print what to delete");
			String del = sc.next();
			if (products != null) {
				for (int i = 0; i < products.length; i++) {
					if (products[i] != null) {
						if (products[i].getType().equals(del)) {
							deleteProduct(i);
						}
					}
				}
			} else {
				System.out.println("No such product in list\n");
			}
			break;
		case 3:
			printBill();
			break;
		case 0:
			break;
		default:
			break;
		}
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
		products[productCounter - 1] = null;
		productCounter--;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	private void printBill() {
		double summ = 0;
		System.out.println("Bill ");
		DealDate.printDealDate(date);
		System.out.println();
		if (buyer != null) {
			System.out.println("Buyer: " + buyer.toString());
			System.out.println();
		}
		if (seller != null) {
			System.out.println("Seller " + seller.toString());
			System.out.println();
		}
		if (products != null) {
			for (Product product : products) {
				if (product != null) {
					double totalProductPrice = product.getQuantity() * product.calcFinalPrice();
					summ += totalProductPrice;
					System.out
							.println(product.getType() + " " + product.calcFinalPrice() + " X " + product.getQuantity()
									+ " = " + totalProductPrice + "(Discount " + product.discount() + "%)");
				}
			}
		}
		System.out.println();
		System.out.println("Total " + summ);
		System.out.println("Deadline: " + DealDate
				.dateToString(java.util.Date.from(deadLine.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())));
		buyer.setMoney(buyer.getMoney() - summ);
		seller.setMoney(seller.getMoney() + summ);
	}

	public void printProducts() {
		double sum = 0;
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			Date dl = java.sql.Date.valueOf(getDeadLine());
			System.out.println("Deadline: " + DealDate.dateToString(dl));
			sum += p.calcFinalPrice() * p.getQuantity();
			System.out.println("Name: " + p.getType());
			System.out.println("Manufacturer: " + p.getManufacturer());
			System.out.println("Quantity: " + p.getQuantity());
			System.out.println("Price: " + p.calcFinalPrice() * p.getQuantity());
			System.out.println("-----------------");
		}
		System.out.println("Total price: " + sum);
	}

	public void deal() {
		double sum = 0;
		if (products != null) {
			for (Product product : products) {
				if (product != null) {
					sum += product.calcFinalPrice() * product.getQuantity();
				}
			}
			if (sum > buyer.getMoney()) {
				System.out.println("Not enought money! ");
			} else {
				printBill();
			}
		} else {
			System.out.println("Empty deal");
			System.out.println();
		}
	}

	void productChoose(Scanner sc) {
		boolean repeat = true;
		do {
			System.out.println(PRODUCT_MENU);
			int productChoose = sc.nextInt();
			switch (productChoose) {
			case 1:
				Vegetables v = new Vegetables();
				addProduct(v.createVegetable(sc));
				break;
			case 2:
				Milk m = new Milk();
				addProduct(m.createMilk(sc));
				break;
			case 3:
				Fruit f = new Fruit();
				addProduct(f.createFruit(sc));
				break;
			case 0:
				repeat = false;
				break;
			default:
				break;
			}
		} while (repeat);
	}

	public void createDeal(Scanner sc) {
		System.out.println("Enter date of deal:");// Take date
		String gDate = sc.next();
		setDate(DealDate.checkDate(gDate, sc));
		System.out.println("Info about buyer");// Take buyer
		buyer = Person.personInput(sc);
		setBuyer(buyer);
		System.out.println("Info about seller");// Take seller
		seller = Person.personInput(sc);
		setSeller(seller);
		productChoose(sc); // add products
		setDeadLine(); // set deadline
	}

	@Override
	public String toString() {
		return "Deal [date=" + date + ", seller=" + seller + ", buyer=" + buyer + ", products="
				+ Arrays.toString(products) + ", productCounter=" + productCounter + ", deadLine=" + deadLine + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((deadLine == null) ? 0 : deadLine.hashCode());
		result = prime * result + productCounter;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Deal))
			return false;
		Deal other = (Deal) obj;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (deadLine == null) {
			if (other.deadLine != null)
				return false;
		} else if (!deadLine.equals(other.deadLine))
			return false;
		if (productCounter != other.productCounter)
			return false;
		if (!Arrays.equals(products, other.products))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		return true;
	}

}
