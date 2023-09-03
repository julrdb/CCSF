/*
package M9;

import java.util.Scanner;

public class Demo_Undergrad
{
	public static void main(String[] args)
	{
		Undergrad U1= new Undergrad("Elsa",5, 2);
		Undergrad U2= new Undergrad();

		System.out.println(U1);
		System.out.println(U2);
		Student S1=new Student("Elsa",5);
		Person P1=new Person("James");
		System.out.println(S1.equals(U1));//Undergrad object used in place of Student object
		//This works since Undergrad is a student

		//U2.set("Frank", 5, 5);//Will display invalid level error and exit code

		U2.set("Frank", 5, 2);//set() of Undergrad is called, 
		//which in turn calls set() of student, which calls set() of person
		
		System.out.println(U2);

		
		S1.set("Alex",30);//set of student is called

		System.out.println(S1);
		System.out.println(U2);
		P1.display();//display() of person is called
		S1.display();//display() of student is called
		U1.display(); //display() of undergrad is called

		Person.display();//display() of person is called
		Student.display();//display() of student is called
		Undergrad.display(); //display() of undergrad is called
		
	}

}
*/
