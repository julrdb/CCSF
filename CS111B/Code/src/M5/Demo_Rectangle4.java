package M5;

/* Demo_Rectangle4.java
  Author- Anita Rathi
  This program demonstrates :
  - Recatngle1 Class 
  - Creating objects of class
  - Accessing methods of class
  - Assigning values of instance variables
  - using get methods
  - constructor usage
  -toString() usage
  

 */

import java.util.Scanner;

public class Demo_Rectangle4
{
	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);
		int x,y;
		Rectangle4 r=new Rectangle4();//Default constructor invoked
		
		Rectangle4 r1=new Rectangle4(10);//1 argument constructor invoked

		System.out.println("Enter length and breadth:");
		x=input.nextInt();
		y=input.nextInt();

		Rectangle4 r2=new Rectangle4(x,y);//2 argument constructor invoked
		
		System.out.println("Object 1");
		System.out.println(r);
		System.out.println("Area= "+ r.area() + " Perimeter=" +
					 		r.perimeter());
		r.set_length(x);// Invoking method of Rectangle1 class
		r.set_breadth(y);
		System.out.println(r);
		System.out.println("Area= "+ r.area() + " Perimeter=" + 
											r.perimeter());

		System.out.println("Object 2");
		System.out.println(r1);
		System.out.println("Area= "+ r1.area() + " Perimeter=" + 
											r1.perimeter());

		System.out.println("Object 3");
		System.out.println(r2);
		System.out.println("Area= "+ r2.area() + " Perimeter=" + 
											r2.perimeter());
		
	}

}
