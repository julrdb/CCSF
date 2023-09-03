package M6;

/*Example5_1.java
  Author- Anita Rathi
  This program demonstrates  :
  - static methods
  

 */

import java.util.Scanner;

public class Example5_1_Static1
{
	public  static int Sum_digits(int n)
	{
		int sum=0,digit;
		while(n>0)
		{
			digit=n%10;
			sum+=digit;
			n/=10;
		}

		return sum;
	}

	public  static int Reverse(int n)
	{
		int rev=0,digit;
		while(n>0)
		{
			digit=n%10;
			rev= rev*10 + digit;
			n/=10;
		}

		return rev;
	}

	public static void Display(int n, String ch)//Formal parameters
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(ch);
			System.out.println();
		}
	}

	public static boolean Prime(int n)//Formal parameters
	{
		boolean pr=true;
		for(int div=2;div<=n/2 && pr;div++)
		{
			if ((n%div)==0)
				pr=false;
		}

		return pr;
	}


	
}
		
