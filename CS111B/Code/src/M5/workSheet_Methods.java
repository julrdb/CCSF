package M5;
import java.util.Scanner;
public class workSheet_Methods {
    public static long palindrome(long p) {
        long rev=0;
        while(p>0) {
            rev = rev*10+(p%10);
            p/=10;
        }
        return rev;
    }
    public static int perfNum(int num) {
        System.out.print("Divisors: ");
        int perf = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + ",");
                perf += i;
            }
        }
        System.out.print(". \n");
        System.out.println("Sum = " + perf);
        return perf;
    }
    public static void pattern(int p) {
        int i, j;
        for(i=1;i<=p;i++) {
            for(j=1;j<=i;j++)
            System.out.print(i);
            System.out.println();
        }
    }
    public static double aveScore(double c1,double c2,double c3,double c4) {
        return ((c1+c2+c3+c4)/4);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m;
        do {
            System.out.println("a. Palindrome Number");
            System.out.println("b. Perfect Number");
            System.out.println("c. Pattern Display");
            System.out.println("d. Calculate Average Score");
            System.out.println("e. Exit.");
            System.out.println("Choose an option (Enter the number of choice): ");
            m = sc.next();
            switch(m) {
                case "a","A" -> {
                    System.out.println("Enter a number: ");
                    long n = sc.nextLong();
                    if(n==palindrome(n))
                        System.out.println(n + " is a palindrome number!");
                    else
                        System.out.println(n + " is NOT a palindrome number.");
                }
                case "b","B" -> {
                    System.out.println("Enter a number: ");
                    int n = sc.nextInt();
                    if(n==perfNum(n))
                        System.out.println(n + " is a perfect number!");
                    else
                        System.out.println(n + " is NOT a perfect number.");
                }
                case "c","C" -> {
                    System.out.println("Enter a number");
                    int n = sc.nextInt();
                    pattern(n);
                }
                case "d","D" -> {
                    System.out.println("List your scores from Class 1 to Class 4: ");
                    double c1, c2, c3, c4;
                    c1 = sc.nextDouble();
                    c2 = sc.nextDouble();
                    c3 = sc.nextDouble();
                    c4 = sc.nextDouble();
                    System.out.printf("Your score average is: %.2f",aveScore(c1,c2,c3,c4));
                    System.out.println();
                }
                case "e", "E" -> System.out.println("Goodbye.");

                default -> System.out.println("Wrong input buddy. Try again. ");
            }
        }
        while(!m.equalsIgnoreCase("e"));
    }
}
