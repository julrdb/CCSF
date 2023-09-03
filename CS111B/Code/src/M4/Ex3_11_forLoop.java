package M4;

/*Example3_9.java
  Author- Anita Rathi
  This program demonstrates  :
  - for loop
  

 */

//import java.util.Scanner;

public class Ex3_11_forLoop
{
	public static void main(String [] args)
	{
		/*
		Scanner input=new Scanner(System.in); 
		int a,b;
		System.out.print("Enter a number:");
		a=input.nextInt();
		System.out.print("Enter another number:");
		b=input.nextInt();
		*/
		int i=1,j=5;
		for(; i<=10 && j<=40; )
		{
			System.out.print(i);
			System.out.print("\t"+j + "\n");
			i+=2;
			j+=7;
		}
		

		System.out.println("I am outside the loop");
		System.out.println(i);
		
	}
}
		
