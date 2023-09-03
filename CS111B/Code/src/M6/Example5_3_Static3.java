package M6;

/*Example5_3_Static3.java
  Author- Anita Rathi
  This program demonstrates :
  - static methods 
  - static variable 
  
 */
public class Example5_3_Static3
{	
	private int num=5;
	
	public void Up()
	{ 
		num++;
	}

	public void Up(int n)//Method overloading
	{
		num+=n;
	}
	/** Overloading caanot be done by changing return type
	Illegal method overloading
	public int Up()
	{ 
		num++;
		return num;

	}
	*/
	public int get_num()
	{
		return num;
	}
}