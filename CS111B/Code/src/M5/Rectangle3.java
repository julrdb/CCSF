package M5;

/* Rectangle3.java
  Author- Anita Rathi
  This program demonstrates  :
  - Class definition
  - Instance Variables
  - Methods in Class
  - Access specifies:public,private
  - get methods(Accessor methods)
  - set methods(Mutator methods)
  - constructors
  - constructor overloading
  

 */

import java.util.Scanner;

public class Rectangle3
{
	private int length,breadth; //private Instance variables

	//Constructors are used to initialize instance variables
	//Constructors do not have a return type.
	//Constructors cannot be explicitly called. They're automatically invoke whe n an object is created.
	public Rectangle3()//No argument/ default constructor
	{
		length=breadth=5;
	}

	public Rectangle3(int l) //Constructor overloading - 1 argument constructor
	{
		length=breadth=l;
	}

	public Rectangle3(int l, int b)//Constructor overloading - 2 argument constructor
	{
		length=l;
		breadth=b;
	}

	//Public methods
	public void set_length(int l)
	{
		length=l;
	}

	public void set_breadth(int b)
	{
		breadth=b;
	}

	public int get_breadth()
	{
		return breadth;
	}

	public int get_length()
	{
		return length;
	}

	public int area()
	{ 
		return length*breadth;
	}

	public int perimeter()
	{ 
		return (2*(length+breadth));
	}
}
