package by.academy.classwork.lesson9;

public abstract class Plant {
	int age;

	public Plant() {
		super();
	}

	public Plant(int age) {
		this.age = age;
	}

	public abstract int method1();

	public int method2() {
		return age * method1();
	}
}
