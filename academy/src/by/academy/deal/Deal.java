package by.academy.deal;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Deal {
	public final static int DEFAULT_PRODUCT_SIZE = 3;

	Date date;
	Person seller;
	Person buyer;
	Product[] products;
	int productCounter = 0;
	LocalDate deadLine;

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

	public Deal(Date date, Person seller, Person buyer) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
	}

	public void dealMenu(Scanner sc) {
		System.out.println("1: Add product");
		System.out.println("2: Delete product");
		System.out.println("3: Info");
		System.out.println("0: Return");
		int tmp = sc.nextInt();
		switch (tmp) {
		case 1:
			System.out.println("Choose product:");
			System.out.println("1: Add Vegetables");
			System.out.println("2: Add Milk");
			System.out.println("3: Add Fruit");
			int productChoose = sc.nextInt();
			switch (productChoose) {
			case 1:
				System.out.println("Print quantity");
				int qty = sc.nextInt();
				addProduct(new Vegetables(50, "Carrot", "AgroHolding", qty, "BLR"));
				break;
			case 2:
				System.out.println("Print quantity");
				qty = sc.nextInt();
				addProduct(new Milk(80, "Milk", "Cow", qty, 2.5, 1.0));
				break;
			case 3:
				System.out.println("Print quantity");
				qty = sc.nextInt();
				addProduct(new Fruit(80, "Orange", "BananaInc", qty, "ECU", 25));
				break;
			default:
				break;
			}
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
				System.out.println("No such product in list");
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
		System.out.println("Deadline: " + deadLine);
		buyer.setMoney(buyer.getMoney() - summ);
		seller.setMoney(seller.getMoney() + summ);
	}

	public void printProducts() {
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			System.out.println("Name: " + p.getType());
			System.out.println("Manufacturer: " + p.getManufacturer());
			System.out.println("Total Price: " + p.calcFinalPrice());
			System.out.println("-----------------");
		}
	}

	public LocalDate getDeadLine() {
		return deadLine;
	}

	public void setDeadLine() {
		this.deadLine = LocalDate.now();
		this.deadLine.plusDays(10);
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
}
