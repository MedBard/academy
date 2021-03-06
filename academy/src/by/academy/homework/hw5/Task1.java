package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("BMW");
		cars.add("BMW");
		System.out.println(removeDuplicate(cars));
	}

	static <T> HashSet<T> removeDuplicate(Collection<T> c) {
		return new HashSet<>(c);
	}
}
