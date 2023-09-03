package A1;

//Time breakdown

import java.util.Scanner;

public class Assignment1_1
{
	public static void main(String[] args)
	{
		int sec, totmins, finhrs, finmins, finsec;
		Scanner time = new Scanner(System.in);
		System.out.println("\nGive me a high-digit seconds, for example 8000:");
		sec = time.nextInt();
		finsec = sec % 60;      //spits out remaining seconds
		totmins = sec / 60;     //spits out total number of minutes
		finmins = totmins % 60; //spits out final number of minutes
		finhrs = totmins / 60;  //spits out final number of hours
		System.out.println(finhrs + "hrs, " + finmins + "mins, " + finsec + "sec\n");
	}
}