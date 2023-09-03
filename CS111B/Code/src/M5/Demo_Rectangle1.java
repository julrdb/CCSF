package M5;

/* Demo_Rectangle1.java
  Author- Anita Rathi
  This program demonstrates :
  - Rectangle1 Class
  - Creating objects of class
  - Accessing methods of class
  - Assigning values of instance variables
  

 */

import java.util.Scanner;

public class Demo_Rectangle1
{
	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);
		int x,y;
		Rectangle1 r=new Rectangle1();
		System.out.println("Enter length and breadth:");
		x=input.nextInt();
		y=input.nextInt();
		r.set_length(x); //Invoking method of Rectangle1 class
		r.set_breadth(y);
		System.out.println("With length=" + r.length + " breadth=" +r.breadth);
		System.out.println("Area= "+ r.area() + " Perimeter=" + r.perimeter());

	}

}
