package M8;

/*Array5.java
  Author- Anita Rathi
  This program demonstrates  :
  - Array Traversal
  - Finding reverse of each element in array, and store the reverses in another array
  - Searching for an element in array
  - Displaying all palindrome numbers in array
  - Returning an array

 */
import java.util.Scanner;

public class Array5
{ 

  public static Scanner input=new Scanner(System.in);
  
  public static int[] Reverse(int[] Arr)
  {
    int Rev[]=new int[Arr.length];
    int i,r;
    int temp;
    for(i=0;i<Arr.length;i++)
    {
      temp=Arr[i];
      r=0;
      while(temp>0)
      {
        r=r*10 + (temp%10);
        temp/=10;
      }
      Rev[i]=r;
    }

    return Rev; //Returning an array
  }
  
  public static boolean Palindrome(int num)
  {
    int temp=num,r=0;
    while(temp>0)
    {
        r=r*10 + (temp%10);
        temp/=10;
    }
    if(num==r)
      return true;
    else 
      return false;
  }

  public static void Display(int [] Arr)
  {
    System.out.println("Elements in Array are " );
    for(int i=0;i<Arr.length;i++)
    {
      System.out.println("Element " + (i+1) + " :" + Arr[i]);
    }

  }

  public static void Input(int [] A)
  {
    for(int i=0;i<A.length;i++)
    {
      System.out.println("Enter element " + (i+1) + " :");
      A[i]=input.nextInt();
    }
  }

  public static int Search(int [] A, int data)
  {
    int i=0;
    boolean found=false;

    while((i<A.length) && !(found))
    {
      if(A[i]==data)
        found=true;
      else
        i++;
    }

    if(found)
        return i;
    else 
        return -1;
  }

  public static void main(String[] args)
  {
    
    int[] A;
    int size,i;
   
    System.out.println("Enter the number  of elements:");
    size=input.nextInt();
    A=new int[size];//Reference created for array
    
   // A[size+2]=100; Throws ArrayIndexOutOfBoundsException
    Display(A);
    Input(A);
    System.out.println("Array with original elements " );
    Display(A);

    int []R=Reverse(A);


    //Arrays are objects
    System.out.println("Array with Reverse of elements " );
    Display(R);

    System.out.println("The palindrome numbers are " );
    for(i=0;i<A.length;i++)
    {
      if(Palindrome(A[i])==true)
        System.out.println(A[i]);
    }

    System.out.println("Enter the number  to be searched:");
    int dt=input.nextInt();

    /*
    if(Search(A,dt)!=-1)
      System.out.println(dt + " not present");
    else
       System.out.println(dt + " present at index " + Search(A,dt));
    */
     
     int result=Search(A,dt);
     if(result==-1)
      System.out.println(dt + " not present");
     else
       System.out.println(dt + " present at location " + (result+1));
      

  }

} 