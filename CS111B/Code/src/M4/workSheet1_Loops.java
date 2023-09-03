package M4;

/*
1. Take the input of a number n, and display all natural numbers from 1 to n. The program should also calculate the sum of these numbers and display the same.
2. Take the input of a number n, and display all even numbers between 1 to n. The program should also calculate the sum of these numbers and display the sum.
3. Take the input of a number and calculate it’s factorial. The factorial of a number n is the product of all numbers from 1 to n.
For example, 4!=1x2x3x4=24
*/

import java.util.Scanner;

public class workSheet1_Loops {


    //1. Display all numbers
    public void allNum() {
        int n, tot = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = input.nextInt();

        for (int i=1; i <= n; i++) {
            System.out.print(i);
            if (i<n)
                System.out.print(", ");
            tot += i; 
        }
        System.out.println("\nSum = " + tot);        
    }


    //2. All even
    public void allEven() {
        int n, i, tot = 0;  //ini. 0; 2; 3...
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = input.nextInt();
                           
        for (i=1; i <= n; i++) {  //start i w/ 1; 1+1= 2; 2+1=3; 3+1=4...
            if (i % 2 == 0) {
                System.out.print(i);  //prints 2; skip 3; prints 4...
                tot += i;  //i=2 tot=0+2=2; i=4 tot=2+4=6; i=6 tot=6+6=12...
                if(i<n)
                    System.out.print(",");
            }
        }
        System.out.print(".");
        System.out.println("\nSum = " + tot);        
    }
    

    //3. Factorial
    public void factorial() {
        int n, i, tot=1;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        n = input.nextInt();
        System.out.print(n + "! = ");
        for (i=1; i<=n; i++) {
            System.out.print(i);
            tot *= i;
            if (i!=n)
                System.out.print("x");
        }       
        System.out.println("\n"+n+"! = "+tot);
    }

    public static void main(String[] args) {
        workSheet1_Loops a = new workSheet1_Loops();
        //a.allNum();
        //a.allEven();
        //a.factorial();
    }


}