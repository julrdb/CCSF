package M4;

/*Example3_9.java
  Author- Anita Rathi
  This program demonstrates  :
  - for loop
  

 */

//import java.util.Scanner;

public class Ex3_10_forLoop
{
	public static void main(String [] args)
	{
		
		int i,j;
		for(i=1,j=5; (i<=10 && j<=40); i+=2, j+=7)
		{
			System.out.print(i);
			System.out.print("\t"+j + "\n");
		}
		

		System.out.println("I am outside the loop");
		System.out.println(i);
		
	}
}
		
