package by.academy.homework.hw1;

import java.util.Scanner;

public class Task2 {

	public enum TypeOfVariable {
		STRING, INT, DOUBLE, FLOAT, CHAR
	}

	public static void main(String[] args) {
		String inputType;
		TypeOfVariable type;
		Scanner sc = new Scanner(System.in);

		System.out.println("Print type of argument:");
		inputType = sc.next();
		type = TypeOfVariable.valueOf(inputType.toUpperCase());
		System.out.println("Print argument:");

		switch (type) {
		case STRING: {
			String variable;
			variable = sc.next();
			System.out.println("Hello " + variable);
			break;
		}
		case INT: {
			int variable;
			variable = sc.nextInt();
			System.out.println(variable % 2);
			break;
		}
		case DOUBLE: {
			double variable;
			variable = sc.nextDouble();
			System.out.println(variable * 0.7);
			break;
		}
		case FLOAT: {
			float variable;
			variable = sc.nextFloat();
			System.out.println(variable * variable);
			break;
		}
		case CHAR: {
			char variable;
			variable = sc.next().charAt(0);
			System.out.println((int) variable);
			break;
		}
		default:
			System.out.println("Unsupported type");
			break;
		}
		sc.close();
	}
}
