package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		String type = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Print type of argument:");
		
		while (!type.equals("string") || !type.equals("int") || !type.equals("double") || !type.equals("float") || !type.equals("char")) {
			type = sc.next();
			sc.nextLine(); // clear the invalid input before prompting again
			System.out.print("Please type of argument: " + type);
		}
		
		System.out.println("Print argument:");

		switch (type) {
		case "string": {
			String variable;
			variable = sc.next();
			System.out.println("Hello " + variable);
			break;
		}
		case "int": {
			int variable;
			variable = sc.nextInt();
			System.out.println(variable % 2);
			break;
		}
		case "double": {
			double variable;
			variable = sc.nextDouble();
			System.out.println(variable * 0.7);
			break;
		}
		case "float": {
			float variable;
			variable = sc.nextFloat();
			System.out.println(variable * variable);
			break;
		}
		case "char": {
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
