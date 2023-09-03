package M5.inClass5_2;

/*
	DATE.java

*/
class Date
{
	private int day, year;
	private String mon;

	public Date() //default constructor
	{
		mon="Jan";
		day=1;
		year=2020;
	}

	public Date(String m, int d, int y) //multiple argument constructor
	{
		mon=m;
		day=d;
		year=y;
	}

	public String getMonth()
	{
		return mon;
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
	}
	//other accessor methods

	public void set_date(String m, int d, int y)
	{
		mon=m;
		day=d;
		year=y;
	}

	public String toString()
	{
		return (mon+"/"+day+"/"+year);
	}

	public boolean equals(Date other)
	{
		return(mon.equals(other.mon) && (day==other.day)
				&& (year==other.year));
	}


}