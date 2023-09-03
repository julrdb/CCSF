package M5;

/*Example4_1.java
  Author- Anita Rathi
  This program demonstrates  :
  - Methods for following operations:
  - Prime/Composite
  - Reverse of Number
  - Sum of digits in a number
  - Dispalying a pattern
  

 */

import java.util.Scanner;

public class Example4_1_1
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

	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1. Sum of digits");
			System.out.println("2. Display a pattern");
			System.out.println("3. Prime/Composite");
			System.out.println("4. Reverse of a number");
			System.out.println("5. Exit");
			System.out.print("Enter your choice of operation:");
			ch=input.nextInt();

			switch(ch)
			{

			case 1:
				int num;
				System.out.println("Enter a number:");
				num=input.nextInt();

				int sdigits=Sum_digits(num);
				
				System.out.println("Sum of digits="+sdigits);
				System.out.println("Sum of digits="+Sum_digits(6332));

				if(Sum_digits(876)%2==0)
					System.out.println("Sum of digits is even");
				else
					System.out.println("Sum of digits is odd");
				break;

			case 2:
				int rows;
				String c;
				System.out.println("Enter a number:");
				rows=input.nextInt();
				System.out.println("Enter a Character:");
				c=input.next();
				//Method Call
				Display(rows,c);//Actual parameters
				break;
			
			case 3:
				
				System.out.println("Enter a number:");
				num=input.nextInt();
				if(Prime(num))
					System.out.println("Prime");
				else
					System.out.println("Composite");
				break;

			case 4:
				
				System.out.println("Enter a number:");
				num=input.nextInt();
			
				System.out.println("Reverse of number="+ Reverse(num));
				break;
			}

		}while(ch!=5);

	}
	//Method Header
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
		
