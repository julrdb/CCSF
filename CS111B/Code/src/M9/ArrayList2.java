package M9;/* ArrayList2.java

Author- Anita Rathi
  This program demonstrates :
  - ArrayList of String
  - for each loop

 */

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList2
{
    public static void main(String[] args)
    {
        ArrayList<String> A= new ArrayList<String>();
        A.add("Adam");
        A.add("Joa");
        A.add("James");
        A.add("Kate");
        A.add(2,"Bob");
        System.out.println("Using for each loop");
        for(String x:A)
            System.out.println(x);
        /* Using the size() and get() */
        System.out.println("Using for loop");
        System.out.println("Array List with get");
        for(int i=0;i<A.size();i+=2)
        {
            System.out.println(A.get(i));
        }

        System.out.println("With object " + A);

        }   
}
