package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		System.out.println("Choose the operation you want to perform.");
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		System.out.println("Choose the operator :");
		Scanner scanner = new Scanner(System.in);
		int operator = scanner.nextInt();
		System.out.println("Enter the first number:");
		int n1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int n2 = scanner.nextInt();

		int res = 0;
		switch (operator) {
		case 1: {
			res = n1 + n2;
			break;
		}
		case 2: {
			res = n1 - n2;
			break;
		}
		case 3: {
			res = n1 * n2;
			break;
		}
		case 4: {
			res = n1 / n2;
			break;
		}
		default:
			System.out.println("Enter operator is not valid");
		}
		System.out.println("Result is :"+res);
	}
}
