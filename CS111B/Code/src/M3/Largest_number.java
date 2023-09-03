package M3;
//Program takes the input of three numbers, and displays the smallest of three numbers.

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        //int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter three numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a>=b) && (a>=c))
            System.out.println("Largest= " +a);
        else if ((b>=a) && (b>=c))
            System.out.println("Largest= " +b);
        else    
            System.out.println("Largest= " +c);

        System.out.println("We're done here.");
    }
}