package M5;

/* Demo_Rectangle5.java
  Author- Anita Rathi
  This program demonstrates :
  - Rectangle1 Class
  - Creating objects of class
  - Accessing methods of class
  - Assigning values of instance variables
  - using get methods
  - constructor usage
  - toString() usage
  

 */

import java.util.Scanner;

public class Demo_Rectangle5
{
	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);
		int x,y;
		Rectangle5 r1=new Rectangle5();//Default constructor invoked
		
		Rectangle5 r2=r1;
		
		System.out.println("Object 1");
		System.out.println(r1);

		System.out.println("Object 2");
		System.out.println(r2);
		
		System.out.println("Enter length and breadth:");
		x=input.nextInt();
		y=input.nextInt();
		
		
		r1.set_length(x);// Invoking method of Rectangle1 class
		r1.set_breadth(y);
		System.out.println("New Object 1");
		System.out.println(r1);
		
		System.out.println("New Object 2");
		System.out.println(r2);

		if (r1==r2)
			System.out.println("Objects r1 and r2 are equal");
		else
			System.out.println("Objects r1 and r2  are not equal");

		Rectangle5 r3=new Rectangle5();//Default constructor invoked
		
		r3.set_length(r1.get_length());
		r3.set_breadth(r1.get_breadth());

		System.out.println("New Object 1");
		System.out.println(r1);
		
		System.out.println("New Object 3");
		System.out.println(r3);
		//References are compared
		if (r1==r3)
			System.out.println("Objects r1 and r3  are equal");
		else
			System.out.println("Objects r1 and r3  are not equal");

		// Instance variable's values are compared
		if(r1.isequal(r3))
			System.out.println("Objects r1 and r3  are equal");
		else
			System.out.println("Objects r1 and r3  are not equal");
	}

}
