package by.academy.deal;

public class Person {
	String name;
	double money;

	public Person() {
		super();
	}

	public Person(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
