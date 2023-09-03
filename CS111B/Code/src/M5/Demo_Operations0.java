package M5;

import java.util.Scanner;

public class Demo_Operations0
{

  public static Boolean OddEven(int num)//Method header,num is formal parameter
  {
      return num % 2 == 0;
  }
  

  public static int Factorial(int num)//num is formal parameter
  { 
    int fa=1;
    for(int i=1; i<=num; i++)
      fa*=i;

    return fa;

  }

  public static void Pattern(int n, String ch)
  {
    for (int i=1; i<=n;i++)
    {
      for(int j=1;j<=i;j++)
        System.out.print(ch);
        System.out.println();
    }
  }

  public static void main(String [] args)
    {
      
      Scanner input=new Scanner(System.in);
      
      int ch;
      do
      {
        System.out.println("1. Odd or Even");
        System.out.println("2. Factorial");
        System.out.println("3. Pattern");
        System.out.println("4. Exit");
        System.out.print("Enter your choice of operation: ");
        ch=input.nextInt();
        int n;

          switch (ch) {
              case 1 -> {
                  System.out.println("Enter a number:");
                  n = input.nextInt();
                  if (OddEven(n))//n is actual parameter
                      System.out.println("Number is even");
                  else
                      System.out.println("Number is odd");
                  if (OddEven(15))//15 is actual parameter
                      System.out.println("Number is even");
                  else
                      System.out.println("Number is odd");
                  Boolean r = OddEven(n + 8);//n+8 is actual parameter
                  System.out.println(r);
                  System.out.println(OddEven(67));//Calling/Invoking the method
              }
              case 2 -> {
                  System.out.println("Enter a number:");
                  int a = input.nextInt();
                  int fact = Factorial(a);//a is actual parameter
                  System.out.println("Factorial=" + fact);
                  System.out.println(Factorial(6));//Calling/Invoking the method
              }
              case 3 -> {
                  System.out.print("Enter a number: ");
                  int num = input.nextInt();
                  System.out.print("Enter a character: ");
                  String s = input.next();
                  Pattern(num, s);
                  System.out.println("I am back from method");
              }
          }

      }
      while(ch!=4);

    }
    //Method Header
}
