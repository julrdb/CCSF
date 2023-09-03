/*Person.java
  Author- Anita Rathi
  This program demonstrates :
  - Copy Constructor
  
 */

package M9;



public class Person
{

	String name;

	public Person()	
	{
		name="None";
	}

	public Person(String n)
	{
		name=n;
	}


	public Person(Person other)//copy constructor
	{
		name=other.name;
	}

  	public void set(String n)
	{
		this.name=n;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Person other)
	{
		return (name.equals(other.name));
	}

	public String toString()
	{
		return("Name=" + name);
	}
}