package M4;

/*Example3_9.java
  Author- Anita Rathi
  This program demonstrates  :
  - while loop
  

 */

import java.util.Scanner;

public class Ex3_13_whileLoop
{
	public static void main(String [] args)
	{
		
		int i=1;
		boolean repeat=true;
		while(repeat)
		{
			int num;
			Scanner keyboard=new Scanner(System.in);
			System.out.println("Enter a number:");
			num=keyboard.nextInt();
			if(num%2==0)
				System.out.println("Even number");
			else
				System.out.println("Odd number");
			System.out.println("Do you want to repeat(true/false)");
			repeat=keyboard.nextBoolean();

			// if (x==1)
			// 	repeat=true;
			// else
			// 	repeat=false;	
		}
		System.out.println("I am outside the loop");
		//System.out.println(num);
		
	}
}
		
