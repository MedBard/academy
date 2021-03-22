package by.academy.homework.hw7;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
	public static void main(String[] args) {
		System.out.println(Stream.generate(() -> (long) new Random().nextInt(100)).limit(100)
				.map(l -> (long) (l * Math.PI - 20)).filter(l -> (l < 100)).sorted().skip(3).distinct()
				.collect(Collectors.toMap(l -> l, l -> ("Number " + l))));
	}
}