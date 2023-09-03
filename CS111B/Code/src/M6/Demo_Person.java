///*Demo_Person.java
//  Author- Anita Rathi
//  This program demonstrates :
//  - Copy Constructor usage
//  - object1=object 2 leads to data leakage as same reference is assigned
//
// */
//
//
//import java.util.Scanner;
//
//public class Demo_Person
//{
//
//	public static void main(String[] args)
//	{
//		//using anonymous objects
//		Person p1=new Person("Joe", new Date2("Aug",1,1998), new Date2("Sep",1,2015));
//		Date2 d1=new Date2("Oct",10,1981);
//		Date2 d2=new Date2("Jan",15,2017);
//		Person p2=new Person("kamya", d1,d2);
//
//		Person p3=new Person(p1);//using copy constructor
//		Person p4=p2;//leads to data leakage
//		System.out.println("Person 1=" + p1);
//		System.out.println("Person 2=" + p2);
//		System.out.println("Person 3=" + p3);
//
//		if (p1.equals(p3))
//			System.out.println("Equal objects");
//		else
//			System.out.println("Not Equal objects");
//
//		if (p1==p3)
//			System.out.println("Same reference");
//		else
//			System.out.println("Different reference");
//
//		if (p4==p2)
//			System.out.println("Same reference");
//		else
//			System.out.println("Different reference");
//}
//}