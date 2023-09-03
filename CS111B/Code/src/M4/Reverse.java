package M4;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num, ldigit, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();

        while (num>0) {
            ldigit = num%10; //this is the digit breakdowner
            //System.out.println(digit);
            rev=rev*10+ldigit; //this one rebuilds number in reverse
            //System.out.println(rev);
            num/=10;
            //System.out.println(num);
        }
        System.out.println("Reverse = " + rev);
    }
}
