//package M10;
//
//import java.util.Scanner;
//
//public class Polymorphism1
//{
//	public static void main(String [] args)
//	{
//
//		Person [] P=new Person[4];
//		//Dynamic/Late  Binding
//		P[0]=new Undergrad("Hina",10,2);
//		P[1]=new Person("Onielle");
//		P[2]=new Student("Bob",5);
//		P[3]=new Undergrad("Kaya",6,1);
//
//		for (Person x: P)
//			System.out.println(x);
//
//		//Static Binding for static methods
//		Student.show();
//		Student.display();
//		Undergrad.display();
//
//		Student S=new Student("Student temp",20);
//		Student U=new Undergrad("Undergrad temp",30,3);
//		S.show();
//		U.display();
//		S.display();
//
//		S=U;//Upcasting
//		System.out.println(S);
//
//
//		//Clone Object
//		Student temp=S.clone();
//		System.out.println("Clone object of student=" + temp);
//
//	}
//
//
//}
