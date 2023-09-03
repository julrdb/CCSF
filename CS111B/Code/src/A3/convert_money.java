package A3;

/*
1.) Write a program (convert_money.java) that prompts the user like this: “Currency to convert to U.S. dollars: e = Euros, c= Chinese Yuan, r = Indian Rupees, b = Bitcoin: ”. Then depending on which letter the user enters, the program displays “Amount of Euros/Yuan/Rupees/Bitcoin to convert: ”. (Note: the second prompt should only name the one currency the user asked to convert, not all four currencies.) After the user enters the amount, the program displays “In U.S. dollars, that is $N”, (N is the amount converted to U.S. dollars). (6 points)

Conversion rates (from Google, as of Sep 11, 2020):
 
1 Euro         = 1.18 US dollar   
1 Chinese yuan = 0.15 US dollar
1 Indian rupee = 0.014 US dollar
1 Bitcoin      = 10,301.10 US dollar
*/

import java.util.Scanner;

public class convert_money {
    public static void main(String[] args) {
        double e,c,r,b;
        Scanner m = new Scanner(System.in);
        System.out.println("\ne for Euros\nc for Chinese Yuan\nr for Indian Ruppees\nb for Bitcoin\nSelect a currency to be converted to USD:");
        String money = m.next();
        money = money.toLowerCase();
        switch(money){
            case "e": System.out.println("Enter the amount of Euro to be converted to USD");
                e = m.nextDouble();
                System.out.println("It is " + (String.format("%.2f",e*1.18)) + " USD\n");
                break;
            case "c": System.out.println("Enter the amount of Yuan to be converted to USD");
                c = m.nextDouble();
                System.out.println("It is " + (String.format("%.2f",c*0.15)) + " USD\n");
                break;
            case "r": System.out.println("Enter the amount of Rupee to be converted to USD");
                r = m.nextDouble();
                System.out.println("It is " + (String.format("%.2f",r*0.014)) + " USD\n");
                break;
            case "b": System.out.println("Enter the amount of Bitcoin to be converted to USD");
                b = m.nextDouble();
                System.out.println("It is " + (String.format("%.2f",b*10301.10)) + " USD\n");
                break;
            default: System.out.println("Invalid input.\n");
        }
    }
}
//done!