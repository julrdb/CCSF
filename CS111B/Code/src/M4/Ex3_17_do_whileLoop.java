package M4;

/*Example3_9.java
  Author- Anita Rathi
  This program demonstrates  :
  - do...while loop
  

 */

import java.util.Scanner;

public class Ex3_17_do_whileLoop
{
	public static void main(String [] args)
	{
		
		int i=1;
		boolean repeat;

		do
		{
			int num;
			Scanner keyboard=new Scanner(System.in);
			System.out.println("Enter a number:");
			num=keyboard.nextInt();
			if(num%2==0)
				System.out.println("Even number");
			else
				System.out.println("Odd number");
			System.out.println("Do you want to repeat(1/0)?");
			int x=keyboard.nextInt();

			if (x==1)
				repeat=true;
			else
				repeat=false;
			
		}
		while(repeat);
		
		

		System.out.println("I am outside the loop");
		//System.out.println(num);
		
	}
}
		
