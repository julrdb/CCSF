package M5.inClass5_2;

/*
Starter code for BlogEntry Class
BlogEntry.java
*/

public class BlogEntry
{
  //instance variables
  private String usrname;
  private String text;
  private Date doe;

  public BlogEntry() //no-argument constructor (default values)
  {
    doe=new Date(); //invoking the constructor of date for doe..... this came from?? (Date.java)
    usrname = text = "___";
  }

  public BlogEntry(String u, String t, String m, int d, int y) //multiple-argument constructor
  {
    doe=new Date(m,d,y);
    usrname = u;
    text = t;
  }

  public void setDate(String m, int d, int y)
  {
    doe.set_date(m,d,y);
  }

//  public void setUsrname() {
//
//  }
//  public void setText(String s) {
//
//  }

  //other mutator methods...Done

  public Date get_doe()
  {
    String m=doe.getMonth();
    int d=doe.getDay();
    int y=doe.getYear();

    Date temp=new Date(m,d,y);
    return temp;
  }

  //other Accessor methods

  public String getSummary()
  {
    return("" + text.substring(0,10));
  }

  public String toString() {
    return ("Username= " + usrname + "\nText= " + text + "\nDate of Entry= " + doe);
  }

  public boolean equals(BlogEntry other)
  {
    return(other.text.equals(text) && other.usrname.equals(usrname) && other.doe.equals(doe));
  }


}

