package by.academy.lesson1;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Prianik");
		Cat cat2 = new Cat();
		
		cat1.eat();
		cat1.sleep();
		cat1.walk();
		
		cat2.grow();
		cat2.grow();
		cat2.grow();
		System.out.println(cat2.age);
	}

}
