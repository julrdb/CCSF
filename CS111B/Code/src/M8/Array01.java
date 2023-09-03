package M8;

/* Array1.java
 This program demonstrates:
 - Array of integer type
 - length instance variable
 - traversal in array
*/


import java.util.Scanner;

public class Array01
{
   public static void main(String args[])
   { int[] A=new int[10];
   int s=0;
   Scanner input=new Scanner(System.in);
    System.out.println("The elements in array are" );
    for (int i=0;i<A.length;i++)
      {  System.out.print(A[i] + " ");
      }
   System.out.println("\nEnter 10 numbers");

   //Array is an object in java


   //Every array has an instance variable named length, 
   //which is the number of elements
   // in the array
   
   //Traversal
   for (int i=0;i<A.length;i++)
   {  A[i]=input.nextInt();
      s+=A[i];
   }
    System.out.println("sum=" + s);
    System.out.println("Size of array =" + A.length);

    //Traversal
    System.out.println("The elements in array are" );
    for (int i=0;i<A.length;i++)
      {  System.out.println("A[" + i + "]=" + A[i]);
      }
    System.out.println();
    System.out.println(A[10]);
 }
}