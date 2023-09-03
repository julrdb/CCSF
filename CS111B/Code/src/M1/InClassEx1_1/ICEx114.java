package M1.InClassEx1_1;

//4. Write  a program to  convert temperature from Celsius to Fahrenheit.
import java.util.Scanner;

public class ICEx114 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius and I'll convert it to Fahrenheit:");
		float c = a.nextFloat();
		System.out.println("It is " + ((c*9 /5) +32) + " Fahrenheit.");
	}
}
