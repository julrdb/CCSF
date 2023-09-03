package M5;

/* Rectangle2.java
  Author- Anita Rathi
  This program demonstrates  :
  - Class definition
  - Instance Variables
  - Methods in Class
  - Access specifies:public,private
  - get methods(Accessor methods)
  - set methods(Mutator methods)
  

 */

import java.util.Scanner;

public class Rectangle2
{
	private int length,breadth; //private Instance variables

	//Public methods
	public void set_length(int l)//Mutator methods
	{
		length=l;
	}

	public void set_breadth(int b)
	{
		breadth=b;
	}

	public int get_breadth() //Accessor method
	{
		return breadth;
	}

	public int get_length()//Accessor method
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
