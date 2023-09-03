/*Person.java
  Author- Anita Rathi
  This program demonstrates :
  - Copy Constructor
  
 */
package M9.inClass7_inheritance1;

public class Person
{

	String name;
	Date2 date;

	public Person()	
	{
		date = new Date2();
		name="None";
		//date=null;//no reference
	}

	public Person(String n, Date2 d)
	{
		date = new Date2(d);
		name=n;
	}


	public Person(Person other)//copy constructor
	{
		date = new Date2(other.date);
		name=other.name;
	}

  public void setPerson(String n, Date2 d)
	{
		name=n;
		date=new Date2(d);
	}

	public String toString()
	{
		return("Name= " + name +
				"\nDoB= " + date);
	}

	public boolean equals(Person other)
	{
		return (name.equals(other.name)) && (date.equals(other.date));
	}
}