///*Demo_Example5_3_Static3.java
//  Author- Anita Rathi
//  This program demonstrates :
//  - Math Class
//  - pow()
//
// */
//import java.util.Scanner;
//
//public class demoCallByValue
//{
//
//
//
//  public  static  void main()
//  {
//    int x = 35, y=67, a=34, b=21;//local variables of main()
//    System.out.println("a,b Before Update()");
//    System.out.println("Actual parameter a=" +a);
//    System.out.println("Actual parameter b=" +b);
//    update(a,b);
//    System.out.println("a,b After Update()");
//    System.out.println("Actual parameter a=" +a);
//    System.out.println("Actual parameter b=" +b);
//
//    System.out.println("x,y Before Update()");
//    System.out.println("Actual parameter x=" +x);
//    System.out.println("Actual parameter y=" +y);
//    update(x,y);
//    System.out.println("x,y After Update()");
//    System.out.println("Actual parameter x=" +x);
//    System.out.println("Actual parameter y=" +y);
//
//  }
//
//  public static void update(int x, int y)//x, y are formal parameters
//  { //x,y are local to Update()
//    x++;
//    y-=10;
//    System.out.println("Formal parameter x=" +x);
//    System.out.println("Foraml parameter y=" +y);
//
//  }
//}