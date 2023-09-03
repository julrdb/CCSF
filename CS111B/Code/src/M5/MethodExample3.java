package M5;

import java.util.Scanner;

public class MethodExample3 {

	public static Scanner sc = new Scanner(System.in);

    public static int sumDigits(int num) {
        int digit, s=0; //local variables
        while (num>0) {
            digit=num%10;
            s+=digit;
            num/=10;
        }
        return s;
    }

    public static boolean prime(int num) {
        int div=2;
        boolean pr=true;
        
        while((div<=num/2) && pr) { //explain this line: use 7 for num.
            //((2<=3.5) && pr); ((3<=3.5) && pr); stop
            if(num%div==0) //7%2!=0; 7%3!=0; stop
            
                pr=false;

            else
            
                div++; //div=3; stop

        }
        return pr;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        System.out.println("Sum of digits in " + n + " = " + sumDigits(n));
        if(prime(n))
            System.out.println(n + " is a prime number.");
        else   
            System.out.println(n + " is a composite number.");
    }
}


