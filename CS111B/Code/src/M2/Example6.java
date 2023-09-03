package M2;

/*Example6.java
  Author- Anita Rathi
  This program demonstrates  :
  - nextLine()
  - String class
  - length()
  - indexOf()
  - indexOf(s,start)


 */

import java.util.Scanner;

public class Example6
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); //Input is an object of Scanner class
		String str;
		String search;
		System.out.print("Enter a string:");
		str=input.nextLine();//Reading complete line
		System.out.print("Enter string to be searched:");
		search=input.next();
		System.out.println("Length of " + str + " ="+ str.length());
		System.out.println(search + " is present at index " + str.indexOf(search));
		System.out.println("Enter a position:");
		int start=input.nextInt();
		System.out.println("From " + start +" "+ search + " is present at index " + str.indexOf(search, start));	}

}