package by.academy.classwork.lesson6;

import java.util.regex.Pattern;

public class Task6 {
	static Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");

	public static void main(String[] args) {
		String text = "12hdfgh@gmail.com";

		System.out.println(validate(text));
	}

	private static boolean validate(String s) {
		s = s.trim();
		return p.matcher(s).matches();
	}
}
