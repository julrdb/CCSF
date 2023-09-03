package M8;

/* Array3.java
 This program demonstrates:
 - Array of char type
 - converting array of character type to strings
 - converting part of array to string
*/
import java.util.Scanner;

public class Array03
{
   public static void main(String args[])
   { char[] A={'h','e','l','l','o',' ','w','o','r','l','d'};
      String S1 = new String(A);//converting to string
      String S2 = new String(A,3,7);
      String S3= new String(A, 3,5);
   
   //The following statement will not give correct result
   System.out.print("The elements of character array=");
   System.out.println(A);
   //using a loop to access the elements
   for (int i=0;i<A.length;i++)
      System.out.print(A[i]);
   System.out.println();
   
   System.out.println("The elements of String 1=" + S1);
   System.out.println("The length of string 1=" + S1.length());
   System.out.println("The elements of String 2=" + S2);
   System.out.println("The length of string 2=" + S2.length());
   System.out.println("The elements of String 3=" + S3);
   System.out.println("The length of string 3=" + S3.length());
   
   
   
   }
 }