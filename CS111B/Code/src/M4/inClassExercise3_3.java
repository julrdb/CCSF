package M4;

import java.util.Scanner;

public class inClassExercise3_3 {

    //1. nTerms. This code only outputs even squared integers.
    public void nTerms() {
        Scanner sc = new Scanner(System.in);
        int n, even = 0, sum = 0, i = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();  //let's try 3
        System.out.print("N of " + n + " = ");
        while(n != i) {  //3 != 0; 3 != 1; 3 != 2; 3 != 3 -STOP;
            even += 2;  //even = 2; even = 4; even = 6
            //squared = even * even;  //squared = 4; squared = 16; squared = 36;
            sum += (even*even);  //sum = 4; sum = 20; sum = 56;
            i++;  //i = 1; i = 2; i = 3
            System.out.print(even + "²");
            if(i<n)
                System.out.print(" + ");
        }
        System.out.println("\nSum of terms = " + sum);
    }
    
    //2. armStrong. I believe this is Nikolai's work
    public void armStrong() {
        Scanner a = new Scanner(System.in);
    
        System.out.print("\nEnter a multi digit number and we'll determine whether it is an Armstrong number or not: ");
        int armStrong = a.nextInt();
        int rem = armStrong, pow=0, tot=0, ldigit;
        //let's take 153.
        for(; rem>0; rem/=10) {
            pow++;//this for loop is the digit counter.
        }
        rem = armStrong;
        while(rem>0) {
            ldigit = rem%10; //153%10=3; 15%10=5; 1%10=1
            rem/=10;      //153/10 = 15; 15/10=1; 1/10=0 STOP.
            tot += Math.pow(ldigit, pow);   
        }
        if(tot == armStrong)
            System.out.println(armStrong + " is an Armstrong number!");
        else
            System.out.println(armStrong + " is not an Armstrong number.");
    }

    //3. primeComposite
    public void primeComposite() {
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n, i=1, count=0;
        n = pc.nextInt();

        while (i<=n) {
            if (n%i == 0) {
                count++;
            }
            i++;
        }
        if (count>2) {
            System.out.println(n + " is a composite number.");
        }    
        else {
            System.out.println(n + " is a prime number.");
        }
    }

    //4. multiples. Naw San's code.
    public void multiples() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i=1; i<=num; i++) {
        int total = num*i;
        System.out.println(num + " x " + i + " = " + total);
        } 
    } 

    //5a. sumOfDigits
    public void sumOfDigitsA() {
        int sum=0, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a multi-digit number: ");
        int num = sc.nextInt();
        System.out.print("Sum of digits for " + num + "\n = ");
        while(num>0) { 
            rev = rev*10+(num%10);
            num/=10;
        }
        //use rev=1234
        while(rev>0) { //this needs a digit counter if I wanted to add "+" in between digits to display.
            int digit = rev % 10; //4; 3; 2; 1
            System.out.print(digit); //4 3 2 1
            sum += digit; //0+4+3+2+1
            rev /= 10; //123; 12; 1; 0 STOP 
            if(rev!=0) //DO NOT EVER USE WHILE LOOP ON THIS SCENARIO. You'll get infinite " + ".
            System.out.print(" + "); // + + + 
        }                            //4 + 3 + 2 + 1 STOP
        System.out.println("\n = " + sum);
    }

    //5b. sumofDigits. Prof Rathi's demo. This version uses do-while loop and asks user to run program again.
    public void sumOfDigitsB() {
        int num, digit, sum;
        boolean repeat;
        Scanner sc=new Scanner(System.in);

        do {           
            sum=0;
            System.out.print("Enter a number:");
            num=sc.nextInt();
    
            while(num>0) {
            digit = num%10;
            sum += digit;
            num /= 10;
            }  
            System.out.println("Sum of Digits= " + sum);
    
            System.out.print("Do you want to repeat(True/False)?");
            repeat=sc.nextBoolean();
        }
        while(repeat);
    }

    //6. palindrome
    public void palindrome() {
        long num, /* ldigit, */ pal, rev=0;
        java.util.Scanner p = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = p.nextLong();
        pal = num; //apparently you'll need an untouched variable for evaulation on the if-else statement.

        while (num > 0) {
            //ldigit = num%10;
            rev = rev*10+(num%10);
            num/=10;
        }
        System.out.println(rev);
        if (pal == rev)
            System.out.println("It's a palindrome!");
        else
            System.out.println("Sorry, it's not a palindrome.");
    }

    //7. factorial
    public void factorial() {
        int n, i, tot=1;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        n = input.nextInt();
        System.out.print(n + "! = ");

        for (i=1; i<=n; i++) {
            System.out.print(i);
            tot *= i;
            if (i<n)
                System.out.print(" x ");        
        }
        System.out.print(" = " +tot + "\n");
    }

    //8. baseExpo. Medhanie's code.
    public void baseExpo() {
        Scanner b = new Scanner(System.in);
        int base, expo, product = 1, i = 1;
        System.out.print("Enter a base: ");
        base = b.nextInt();
        System.out.print("Enter an exponent: ");
        expo = b.nextInt();

        while (i <= expo) {
            product *= base;
            i++;
        }
        System.out.println(base + " to the power of " + expo + " = " + product);
    }

    //BONUS: fibonacci
    public void fibonacci() {
        int prevNum=0, crrntNum=1, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of iteration for the Fibonacci sequence: ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++) {
            sum = crrntNum+prevNum;
            System.out.print(prevNum);
            if(i<n)
            System.out.print(", ");
            prevNum = crrntNum;
            crrntNum = sum;
        }
        System.out.println(".");
    } 


    public static void main(String[] args) {
        inClassExercise3_3 a = new inClassExercise3_3();
            // a.nTerms();
            // a.armStrong();
            // a.primeComposite();
            // a.multiples();
            // a.sumOfDigitsA();
            // a.sumOfDigitsB();
            // a.palindrome();
            // a.factorial();
            // a.baseExpo();
            a.fibonacci();
    }
}