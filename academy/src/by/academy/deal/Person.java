package by.academy.deal;

public class Person {
	String name;
	double money;
	String dateOfBirth;
	String phone;
	String email;

	public Person() {
		super();
	}

	public Person(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	public Person(String name, double money, String dateOfBirth, String phone, String email) {
		super();
		this.name = name;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "(name=" + name + ", money=" + money + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", email="
				+ email + ")";
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
