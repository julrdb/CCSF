package M3;
/*
Refer to WorksheetConditionalConstructs1.pdf
*/
import java.util.Scanner;

public class workSheet_ConditionalConstructs1 {
    
    //1. Largest number
    public void largestNum() {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter three numbers:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a>=b) && (a>=c))
            System.out.println("Largest= " +a);
        else if ((b>=a) && (b>=c))
            System.out.println("Largest= " +b);
        else    
            System.out.println("Largest= " +c); 
    }

    //2. Classify age group
    public void age() {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your age: ");
        a = sc.nextDouble();
        if (a <= 1)
            System.out.println("You're an infant.");
        else if ((a > 1) && (a < 13))
            System.out.println("You're a child.");
        else if ((a >= 13) && (a < 20))
            System.out.println("You're a teenager.");
        else //if (a >= 20)
            System.out.println("You're an adult.");   
    }


    //3. Secondary Colors
    public void secondaryColors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose between red, blue, & yellow for Color1: ");
        String c1 = sc.nextLine();
        System.out.println("Choose between red, blue, & yellow for Color2 (you cannot repeat the last color you chose): ");
        String c2 = sc.nextLine();
        if (((c1.equalsIgnoreCase("red")) && (c2.equalsIgnoreCase("blue"))) || ((c1.equalsIgnoreCase("blue")) && (c2.equalsIgnoreCase("red"))))
            System.out.println("It's purple!");
        else if (((c1.equalsIgnoreCase("red")) && (c2.equalsIgnoreCase("yellow"))) || ((c1.equalsIgnoreCase("yellow")) && (c2.equalsIgnoreCase("red"))))
            System.out.println("Its' orange!");
        else if (((c1.equalsIgnoreCase("blue")) && (c2.equalsIgnoreCase("yellow"))) || ((c1.equalsIgnoreCase("yellow")) && (c2.equalsIgnoreCase("blue"))))
            System.out.println("It's green!");
        //else if ((()&&())||(()&&()))
        else
            System.out.println("Wrong color!");                 
    }


    //4. Color roulette
    public void roulette() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n<1)
            System.out.println("Pocket is green.");
        else if ((n>=1) && (n<=10))
            if (n%2==0) //even
                System.out.println("Pocket is black.");
            else //odd
                System.out.println("Pocket is red."); 
        else if ((n>=11) && (n<=18))
            if (n%2==0)
                System.out.println("Pocket is red.");
            else
                System.out.println("Pocket is black.");
        else if ((n>=19) && (n<=28))
            if (n%2==0)
                System.out.println("Pocket is black.");
            else
                System.out.println("Pocket is red."); 
        else if ((n>=29) && (n<=36))                                                   
            if (n%2==0)
                System.out.println("Pocket is red.");
            else
                System.out.println("Pocket is black.");   
        else 
            System.out.println("Invalid number. It is outside the range of 0-36.");         
    }


    //5. Packge discount bundle
    public void discount() {
        double p, tot;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a numnber of packages you've purchased:");
        p = input.nextDouble();
        tot = (p*99);
        if ((p >= 10) && (p <= 19))
            System.out.println("You get 20% discount. Your total is " + (String.format("$%.2f",tot*.9)));
        else if ((p >=20) && (p <= 49))
            System.out.println("You get 20% discount. Your total is " + (String.format("$%.2f",tot*.8)));
        else if ((p >=50) && (p <= 99))
            System.out.println("You get 30% discount. Your total is " + (String.format("$%.2f",tot*.7)));
        else if (p >= 100)
            System.out.println("You get 40% discount. Your total is " + (String.format("$%.2f",tot*.6)));
        else
            System.out.println("You get no discount. Your total is " + (String.format("$%.2f",tot)));
    }

    public static void main(String[] args) {
        workSheet_ConditionalConstructs1 a = new workSheet_ConditionalConstructs1();
            //a.largestNum();
            //a.age();
            a.secondaryColors();
            //a.roulette();                 
            //a.discount();
    }


}

/*Notes:
--tot need to be a double because if it was int, it would error out on (String.format("$%.2f",tot)); like on the last else statement.
--int does not render decimals. Remember, INTEGER!
-- {} may not be needed if there isn't compound statements(multi-line), e.g. one-liner code. But it may be better practice to include it for future proofing.
-- the % in ("%.2f",tot); can have any value attached before it, i.e. $ for currency. ("$%.2f",tot);
*/