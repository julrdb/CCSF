package M8;

/* Array2.java
 This program demonstrates:
 - passing array to methods
 - arrays are objects in java
 - array initialization
*/

import java.util.Scanner;

public class Array02
{

   public static void Modify(int [] Arr)
   {
      // Modified elements will be accessible in calling function

      for(int i=0;i<Arr.length;i++)
      {
         Arr[i]+=10;
      }

      System.out.println("The elements in Modify()");

      for (int i=0;i<Arr.length;i++)
       System.out.print(Arr[i] + " ");
      System.out.println();

   }

   public static void main(String args[])
   { int[] A={3,5,6,7,8,9};
   
   Scanner input=new Scanner(System.in);
   System.out.println("The elements before calling Modify()");

   for (int i=0;i<A.length;i++)
      System.out.print(A[i]+ " ");
   System.out.println();
   //Only the name of Array is used as parameter
   //Since array is an object, a reference to it is passed to method

   Modify(A);
   System.out.println("The elements after calling Modify()");

   for (int i=0;i<A.length;i++)
      System.out.print(A[i]+ " ");
   System.out.println();

   
   
   }
 }