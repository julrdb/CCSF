package M5;

/* Rectangle1.java
  Author- Anita Rathi
  This program demonstrates  :
  - Class definition
  - Instance Variables
  - Methods in Class
  - set methods(Mutator methods)
  

 */

//import java.util.Scanner;

public class Rectangle1
{
	public int length,breadth; //Instance variables

	public void set_length(int l) //Mutator method
	{
		length=l;
	}

	public void set_breadth(int b)
	{
		breadth=b;
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
