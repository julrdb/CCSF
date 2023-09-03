package M8;/*Array6.java
  Author- Anita Rathi
  This program demonstrates  :
  - Array of objects

 */
import java.util.Scanner;

public class Array6
{ 
  
  public static void main(String[] args)
  {
    int i,size;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number  of objects:");
    size=input.nextInt();
    Person []Arr_person=new Person[size];
    for(i=0; i<Arr_person.length; i++)
    {
      Arr_person[i]=new Person();
    }

    Arr_person[0].setPerson("Joe", new Date2("Aug",1,1998), new Date2("Sep",1,2015));
    Date2 d1=new Date2("Oct",10,1981);
    Date2 d2=new Date2("Jan",15,2017);
    Arr_person[1].setPerson("Kamya", d1,d2);
    Arr_person[2].setPerson("Jason", d1,d2);

    for(i=0; i<Arr_person.length; i++)
    {
      System.out.println("Person " + (i+1) + ":" +  Arr_person[i]);
     
    }
    
  }
} 