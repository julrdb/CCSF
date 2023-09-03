package M8;

/*Array4.java
  Author- Anita Rathi
  This program demonstrates  :
  - arrays
  - Passing arrays to methods
  - Arrays are object in Java

 */
import java.util.Scanner;

public class Array4
{ 
  public static int Sum(int[] Arr)
  {
    int i,s=0;
    for(i=0;i<Arr.length;i++)
    {
      s+=Arr[i];
    }
    System.out.println("Average of the elements: " + s/Arr.length); 
    return s;
  }
  
  public static void Modify(int[] Arr)
  {
    for(int i=0;i<Arr.length;i++)
    {
      Arr[i]+=Arr[i];
    }

    System.out.println("Updated elements in Modify() are " );
    for(int i=0;i<Arr.length;i++)
    {
      System.out.println("Element " + (i+1) + " :" + Arr[i]);
    }

  }

  public static void main(String[] args)
  {
    
    int[] A; //Array declaration
    int size,i;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number  of elements:");
    size=input.nextInt();
    A=new int[size]; //Reference for array is creator
    System.out.println("Length of array= " + A.length);
    for(i=0;i<A.length;i++) //Traversal of array
    {
      System.out.println("Enter element " + (i+1) + " :");
      A[i]=input.nextInt();
    }

    System.out.println("Sum of the elements: " + Sum(A)); //Calling static method
    Modify(A); // A is the actual parameter

    //Arrays are objects
    System.out.println("Updated elements in main() are " );
    for(i=0;i<A.length;i++)
    {
      System.out.println("Element " + (i+1) + " :" + A[i]);
    }
  }
} 