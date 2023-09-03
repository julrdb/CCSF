package M5;

/* Demo_Rectangle3.java
  Author- Anita Rathi
  This program demonstrates :
  - Recatngle1 Class 
  - Creating objects of class
  - Accessing methods of class
  - Assigning values of instance variables
  - using get methods
  - constructor usage
  

 */

import java.util.Scanner;

public class Demo_Rectangle3
{
	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);
		int x,y;
		Rectangle3 r=new Rectangle3();//Default constructor invoked
		
		Rectangle3 r1=new Rectangle3(10);//1 argument constructor invoked

		System.out.println("Enter length and breadth:");
		x=input.nextInt();
		y=input.nextInt();

		Rectangle3 r2=new Rectangle3(x,y);//2 argument constructor invoked

		System.out.println("Object 1");
		System.out.println("With length=" + r.get_length() +
		 				" breadth=" +r.get_breadth());
		System.out.println("Area= "+ r.area() + " Perimeter=" +
					 		r.perimeter());
		r.set_length(x);// Invoking method of Rectangle1 class
		r.set_breadth(y);
		System.out.println("With length=" + r.get_length() + 
									" breadth=" +r.get_breadth());
		System.out.println("Area= "+ r.area() + " Perimeter=" + 
											r.perimeter());

		System.out.println("Object 2");
		System.out.println("With length=" + r1.get_length() + 
								" breadth=" +r1.get_breadth());
		System.out.println("Area= "+ r1.area() + " Perimeter=" + 
											r1.perimeter());

		System.out.println("Object 3");
		System.out.println("With length=" + r2.get_length() + 
								" breadth=" +r2.get_breadth());
		System.out.println("Area= "+ r2.area() + " Perimeter=" + 
											r2.perimeter());
		
	}

}
