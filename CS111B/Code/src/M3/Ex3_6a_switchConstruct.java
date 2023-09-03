package M3;

/*Example3_6a.java
  Author- Anita Rathi
  This program demonstrates  :
  - switch...construct
  

 */

import java.util.Scanner;

public class Ex3_6a_switchConstruct
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); 
		int cl;
		System.out.print("Enter a number:");
		
		cl=input.nextInt();
		
		switch(cl)
		{
			case 10:System.out.println("Ten");
			break;
			case 20:System.out.println("Twenty");
			break;	
			case 30:System.out.println("Thirty");
			break;		
			case 40:System.out.println("Forty");
			break;
			default:System.out.println("Wrong Input");
			
		}		
		
		System.out.println("END OF PROGRAM");		
		
	}
}
		
