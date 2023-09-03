package M5;

import java.util.Scanner;

public class inClassExercise3_4 {


    public static boolean prime(int n) {
        int i=1, count=0;
        while (i<=n) {
            if (n%i == 0) {
                count++;
            }
            i++;
        }
        return count>2;
//        if (count>2)
//            return true;
//        else
//            return false;
    }
    
    public static int sumOfDigits(int num) {
        int sum=0, digit;
        while (num>0) {
            digit = num%10;
            sum += digit;
            num /= 10;
        }
        return sum;
        //System.out.println("\nSum of Digits = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        boolean repeat;
        do  {
            System.out.println("1. Prime or Composite");
            System.out.println("2. Sum of Digits");
            System.out.println("Choose your operation (Enter 1 or 2): ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Enter a number: ");
                    int pCom = sc.nextInt();
                    if (prime(pCom))
                        System.out.println(pCom + " is a composite number.");
                    else
                        System.out.println(pCom + " is a prime number.");
                }
                case 2 -> {
                    System.out.println("Enter a multi-digit number:");
                    int s = sc.nextInt();
                    //int dSum = sumOfDigits(s);
                    System.out.println("Sum of Digits for " + s + " = " + sumOfDigits(s));
                }
                default -> System.out.println("Uhhh you put the wrong number yo.");
            }
            System.out.println("Do you want to run the program again (True/False)?");
            repeat = sc.nextBoolean(); 
        }
        while(repeat);
    }
}


