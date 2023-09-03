package M7;

/*DemoMath.java
  Author- Anita Rathi
  This program demonstrates :
  - Math Class
  - method overloading
  
 */
import java.util.Scanner;

public class DemoMath
{ 
  public static int sum(int a, int b)//Method signature- sum(int,int)
  {
    return (a+b);
  }
  //Method signature- sum(float,float)
  public static float sum(float a, float b)//Method overloading
  {
    return (a+b);
  }

  //Method signature- sum(double)
  public static double sum(double a)
  {
    return (a+a);
  }

  //Method signature- sum(int,float)
  public static float sum(int a, float b)
  {
    return (a+b);
  }

  //Method signature- sum(float,int)
  public static float sum(float a, int b)
  {
    return (a+b);
  }
  public  static  void main(String [] args)
  {
    System.out.println("Pow method results");
    System.out.println("power method=" +Math.pow(3,2));
    double result=Math.pow(6.3,5);
    System.out.println("power method=" + result);
    System.out.println("power method=" +Math.pow(3.0,2.0));

    System.out.println("Method Overloading results");
    System.out.println("Invocation1=" + sum(3,2));//calls sum(int,int)
    float x=3.7F;
    System.out.println("Invocation2=" + sum(x,(float)2.6));//calls sum(float,float)
    System.out.println("Invocation3=" + sum(3,2));//calls sum(int,int)
    
    System.out.println("abs() Method results- Overloaded methods are used");
    long y=-89;
    System.out.println("Invocation1=" + Math.abs(-2));
    System.out.println("Invocation2=" + Math.abs(-4.5));
    System.out.println("Invocation3=" + Math.abs(y));
    System.out.println("Invocation4=" + Math.abs(x));

    System.out.println("max(), min() results");
    System.out.println("Invocation1=" + Math.max(3.6,2));//calls max(double,double)
    System.out.println("Invocation2=" + Math.min(2,89));//calls min(int,int)
    System.out.println("Invocation3=" + Math.min(6.5f,78.7f));//calls min(float,float)

    
    /*
    System.out.println(Math.floor(-3.2));
    System.out.println(Math.round(-3.2));
   */
  }
}