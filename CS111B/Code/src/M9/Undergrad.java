package M9;
 /*Undergrad.java
	Author : Anita Rathi
	Derived Class */



import java.util.Scanner;

public class Undergrad extends Student
{
	private int level;// 1-freshman, 2-sophomore, 3-junior, 4-senior

	public Undergrad()
	{
		//super();	//Invoking base class - student constructor
		level=0;
	
	}

	public Undergrad(String n, int no, int l)
	{
		super(n,no);
		setlevel(l);
	}

	public void set(String n, int no, int l)//overloaded method
	{
		set(n,no); //Invoking overloaded method
		setlevel(l);
	}

	public void setlevel(int l)
	{
		if((l>=1) && (l<=4))
			level=l;
		else
			{	System.out.println("Invalid level");
				System.exit(0);	
		}
	}

	public int getlevel()
	{
		return level;
	}

	public String toString()//overriding
	{
		return("Name= " + getName() + " Number=" + getno() + " Level=" + getlevel());
	}

	public static void display()//overridden method 
	{
		System.out.println("This is Undergrad class");
	}
	

	public boolean equals(Undergrad other)
	{
		return(super.equals(other) && other.level==level);
	}
}
