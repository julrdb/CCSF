package M6;

/*Demo_Example5_1.java
  Author- Anita Rathi
  This program demonstrates  :
  - static methods
  
 */

import java.util.Scanner;

public class Demo_Example5_1_Static1
{

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


					Example5_1_Static1 object1=new Example5_1_Static1();
					int sdigits=object1.Sum_digits(num);//Method invocation/call
					
					System.out.println("Sum of digits="+sdigits);
					
					break;

				case 2:
					int rows;
					String c;
					System.out.println("Enter a number:");
					rows=input.nextInt();
					System.out.println("Enter a Character:");
					c=input.next();
					//Method Call
					Example5_1_Static1.Display(rows,c);//Actual parameters
					break;
				
				case 3:
					
					System.out.println("Enter a number:");
					num=input.nextInt();
					if(Example5_1_Static1.Prime(num))
						System.out.println("Prime");
					else
						System.out.println("Composite");
					break;

				case 4:
					
					System.out.println("Enter a number:");
					num=input.nextInt();
				
					System.out.println("Reverse of number="+ Example5_1_Static1.Reverse(num));
					break;
				}

			}while(ch!=5);

		}
		//Method Header
}


