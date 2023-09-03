package M1;

/*Program to assign values to two float variables, and then calculate and display their sum, difference, product, and quotient*/
import java.util.Scanner;


//Now let's try it with inputs for x and y.
public class Ex2_3 {
	public static void main(String[] args) {
		float x, y;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = num.nextInt();
		System.out.println("Enter another number:");
		y = num.nextInt();
		//add
		System.out.println("x + y = " + (x + y));
		//subtract
		System.out.println("x - y = " + (x - y));
		//multiply
		System.out.println("x * y = " + (x * y));
		//divide
		System.out.println("x / y = " + (x / y));
		//Remainder(modulo)
		System.out.println("x % y = " + (x % y));
	}
}

//Anitha Rathi's code (with inputs for x & y)

/*
public class Ex2_3{
	public static void main(String[] args) {
		float x, y;
		Scanner input = new Scanner(System.in); //obj for input purpose
		System.out.println("Enter a number: ");
		x = input.nextFloat(); //object.method() - read next float number from terminal
		// input method for integer is nextInt()
		System.out.println("Enter another number: ");
		y = input.nextFloat(); //object.method() - read next float number from terminal
		System.out.println("Sum = " + (x + y));
		System.out.println("Diff = " + (x - y));
		System.out.println("Product = " + (x * y));
		System.out.println("Quotient = " + (x / y));
		System.out.println("Remainder = " + (x % y)); // % is modulo, the remainder operator 
	}
}
*/
