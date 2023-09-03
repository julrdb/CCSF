package M1.InClassEx1_1;

//2. Write a program to calculate and display the area and circumference of a circle.
//The radius will be entered by the user. Use appropriate variable names.

import java.util.Scanner;
import java.lang.Math;

public class ICEx112 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a radius of a circle:");
		float r = a.nextFloat();
		System.out.println("Area is " + (Math.PI * r * r));
		System.out.println("Circumference is " + (2 * Math.PI * r));
	}
}