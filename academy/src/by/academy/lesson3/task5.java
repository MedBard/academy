package by.academy.lesson3;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("print 1st num:");
		num1 = sc.nextDouble();
		System.out.println("print 2nd num:");
		num2 = sc.nextDouble();
		
		if (num1 >num2) {
			System.out.println(num1 + " > " + num2);
		}else if(num1 <num2) {
			System.out.println(num2 + " > " + num1);
		} else {
			System.out.println(num1 + " = " + num2);
		}
		
		System.out.println("average: " + (num1 + num2) / 2);
		sc.close();
	}

}
