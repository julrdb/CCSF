package M1.InClassEx1_1;

//1. Write Java code for taking the input of 2 numbers and then finding and displaying their sum, difference, product, quotient, and remainder.

import java.util.Scanner;

public class ICEx111 {
	public static void main(String[] args) {
		int x, y;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first number:");
		x = a.nextInt();
		System.out.println("Enter the second number:");
		y = a.nextInt();
		System.out.println("Sum is " + (x + y));
		System.out.println("Difference is " + (x - y));
		System.out.println("Product is " + (x * y));
		System.out.println("Quotient is " + (x / y));
		System.out.println("Remainder is " + (x % y));
	}
}