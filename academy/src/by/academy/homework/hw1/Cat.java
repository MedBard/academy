package by.academy.homework.hw1;

public class Cat {
	int age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal;

	public Cat() {
		super();
		setIsHomeAnimal(false);
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
		setInitials(nickname);
		setIsHomeAnimal(true);
	}

	public void grow() {
		age++;
	}

	public void sleep() {
		System.out.println("Mrrrrrr");
	}

	public void eat() {
		System.out.println("Omnomnom");
	}

	public void walk() {
		System.out.println("Cat walk");
	}

	public void getMoney() {
		System.out.println(money);
	}

	public void setMoney(double cash) {
		money = cash;
	}

	public void getInitials() {
		System.out.println(initials);
	}

	public void setInitials(String nickname) {
		initials = nickname.charAt(0);
	}

	public void isHomeAnimal() {
		if (isHomeAnimal == true) {
			System.out.println("Cat has own home");
		} else {
			System.out.println("Cat in search his own home");
		}

	}

	public void setIsHomeAnimal(boolean home) {
		isHomeAnimal = home;
	}
}
