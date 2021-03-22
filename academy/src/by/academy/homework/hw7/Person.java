package by.academy.homework.hw7;

import java.time.LocalDate;

public class Person {
	private String firstName;
	public String lasttName;
	private int age;
	private LocalDate dateOfBirth;
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lasttName=" + lasttName + ", age=" + age + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
