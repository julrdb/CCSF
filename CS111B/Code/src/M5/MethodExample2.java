package M5;

import java.util.*;

public class MethodExample2 {
    public static Scanner input;
    public static long power(int base, int exp) { //method header
        //base exponent are called formal parameters
        //power is the name of the method
        //it returns a long type value. It only executes defined statements
        int i; long prod=1;
        for (i=1; i<=exp; i++) {
            prod+=base;
        }
        return prod; //returns the result
    }
    public static void main(String[] args) {
    int b,e;
    long sum = 0;
    System.out.print("Enter base: "); 
    input = new Scanner(System.in);
    b = input.nextInt();
    System.out.print("Enter exponent: ");
    e = input.nextInt();
    long p = power(b,e); //method call
    //b,e are actual parameters
    sum+=p;
    System.out.println("Result= " +p);
    if (p%2==0)
        System.out.println("Even");
    else
        System.out.println("Odd");
    
    System.out.println("Result 2= " + power(2,5));
    if ((power(b--,e+1)) ==100)
        System.out.println("Morning");
    else
        System.out.println("Evening");
    }

}