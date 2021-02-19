package by.academy.deal;

import java.util.Date;
import java.util.Scanner;

public class Person {
	private String name;
	private double money;
	private Date dateOfBirth;
	private String phone;
	private String email;

	public Person() {
		super();
	}

	public Person(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	public Person(String name, double money, Date dateOfBirth, String phone, String email) {
		super();
		this.name = name;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
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

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		if (dateOfBirth != null) {
			return "(Name: " + name + ", money: " + money + ", dateOfBirth: " + DealDate.dateToString(dateOfBirth)
					+ ", phone: " + phone + ", email: " + email + ")";
		} else {
			return "No data";
		}
	}

	static Person personInput(Scanner sc) {
		Person p = new Person();
		String gDate;
		AmericanPhoneValidator apv = new AmericanPhoneValidator();
		BelarusPhoneValidator bpv = new BelarusPhoneValidator();
		EmailValidator ev = new EmailValidator();

		System.out.print("Enter name :");
		p.setName(sc.next());
		System.out.print("Enter money:");
		p.setMoney(sc.nextDouble());
		System.out.print("Enter birthday:");
		gDate = sc.next().trim();
		p.setDateOfBirth(DealDate.checkDate(gDate, sc));
		System.out.print("Enter phone number:");
		String tmp = sc.next().trim();
		boolean check = apv.validate(tmp) | bpv.validate(tmp);
		do {
			if (check) {
				p.setPhone(tmp);
				break;
			} else {
				System.out.print("Enter correct phone number:");
				tmp = sc.next().trim();
				check = apv.validate(tmp) | bpv.validate(tmp);
			}
		} while (!check);
		System.out.print("Enter email:");
		tmp = sc.next().trim();
		do {
			if (ev.validate(tmp)) {
				p.setEmail(tmp);
				break;
			} else {
				System.out.print("Enter correct email:");
				tmp = sc.next().trim();
			}
		} while (!ev.validate(tmp));
		return p;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		long temp;
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (!other.equals(obj)) {
			return false;
		}
		return true;
	}

}
