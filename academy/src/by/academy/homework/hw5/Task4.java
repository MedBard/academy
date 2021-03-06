package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		Integer maxMark = 0;
		for (int i = 0; i < 10; i++) {
			Double d = (Math.random() * 10 + 1);
			marks.add(d.intValue());
		}

		Iterator<Integer> iterator = marks.iterator();
		while (iterator.hasNext()) {
			Integer m = iterator.next();
			if (maxMark < m)
				maxMark = m;
		}
		System.out.println("Marks " + marks);
		System.out.println("Max mark is " + maxMark);
	}
}