package M9;
 /*Student.java
	Author : Anita Rathi
	Derived Class */


public class Student extends Person //Student inherited from Person
{
	private int Sno;

	public Student()
	{
		super();//Invoking base class constructor
		Sno=0;
	}

	public Student(String n, int no)
	{
		super(n); //invoking the constructor of base class
		Sno=no;
	}

	public Student(Student other)
	{
		super(other);//invoking the constructor of base class
		Sno=other.Sno;
	}

	public void set(String n, int no)//overloading
	{
		set(n);//invoking set() of Person class
		this.Sno=no;
	}

	public int getno()
	{
		return Sno;
	}

	public String toString()//overriding toString of Person class
	{
		return("Name= " + super.toString() + " Sno= " + getno());

	}

	public static void display()//overridden method
	{
		//super.display();
		System.out.println("This is student class");
	}

	public static void show()
	{
		System.out.println("This is show method of student");
	}

	public boolean equals(Student other)
	{
		//return( (other.get().equalsIgnoreCase(this.get()) )
		//	&& (other.Sno==this.Sno) );
		return(super.equals(other) && (other.Sno==this.Sno));
	}

	public Student clone()
	{
		return new Student(this);
	}
}
