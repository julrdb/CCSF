/*Person.java
  Author- Anita Rathi
  This program demonstrates :
  - Copy Constructor
  
 */
package M8;

public class Person
{

	String name;
	Date2 dob,dod;

	public Person()	
	{
		name="None";
		dob=null;//no reference
		dod=null;
	}

	public Person(String n, Date2 db, Date2 dd)	
	{
		name=n;
		dob=new Date2(db);
		//dob=db
		dod=new Date2(dd);
	}


	public Person(Person other)//copy constructor
	{
		name=other.name;
		dob=new Date2(other.dob);
		dod=new Date2(other.dod);
	}

  public void setPerson(String n, Date2 db, Date2 dd)	
	{
		name=n;
		dob=new Date2(db);
		//dob=db
		dod=new Date2(dd);
	}


	public boolean equals(Person other)
	{
		if ((name.equals(other.name)) && (dob.equals(other.dob)) && (dod.equals(other.dod)) )
			return true;
		else
			return false;
	}

	public String toString()
	{
		return("Name=" + name + " " + " Date of Birth= " 
			+ dob + " Date of Death= " + dod);
	}
}