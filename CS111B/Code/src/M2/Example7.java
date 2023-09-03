package M2;

/*Example7.java
  Author- Anita Rathi
  This program demonstrates  :
  - equals()
  - equalsIgnoreCase()
  - compareTo()
  - \n
  - \t
 */

import java.util.Scanner;

public class Example7
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); //Input is an object of Scanner class
		String str1;
		String str2;
		System.out.print("\nEnter a string:");
		str1=input.nextLine();//Reading complete line
		System.out.print("Enter another string:");
		str2=input.next();
		System.out.print("Result of equals=\t " + str1.equals(str2) + '\n');
		System.out.print("Result of equals= st " + str2.equals(str1) + "\n");
		System.out.println("Result of equalsIgnoreCase= " + str1.equalsIgnoreCase(str2));
		System.out.println("Result of compareTo= " + str1.compareTo(str2));
		System.out.println("Result of compareTo= " + str2.compareTo(str1));

	}

}