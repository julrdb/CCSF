package A1;

//Interest calculator
/* Suppose you want to deposit a certain amount of money into a savings account and leave it alone to draw interest for the next 10 years. At the end of 10 years, you would like to have $10,000 in the account. How much do you need to deposit today to make that happen? Rate of interest is 2.99. You can use the following formula to find out:

P=F/(1+r)^n
The terms in the formula are as follows:

P is the present value, or the amount that you need to deposit today.
F is the future value that you want in the account. (In this case, F is $10,000.)
r is the annual interest rate.
n is the number of years that you plan to let the money sit in the account. */

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Assignment1_2 {
    public static void main(String[] args) {
        double P, F, r, n;
        Scanner mula = new Scanner(System.in);
        System.out.println("\nLets's find out how much you would need to start to invest today!");
        System.out.println("First, how many years do you want to invest? (put 10 first, then play the values later on the next round).");
        n = mula.nextDouble();
        System.out.println("Second, how much would you like to have after " + n + " years? (put 10000 first, then play with the values later on the next round).");
        F = mula.nextDouble();
        System.out.println("Lastly, set your interest rate. (put 2.99 first, then play the values later on the next round).");
        r = mula.nextDouble();
        P = F / Math.pow((1 + (r / 100)), n);
        System.out.println("With an annual interest rate of " + r + "%, your initial deposit has to be $" + (String.format("%.2f", P)) + " in order to have $" + (String.format("%.2f", F)) + " after " + (new DecimalFormat("#.#").format(n)) + " years.\n");
        /*Notes*/
        // I noticed (String.format("%.2f", value)) works best when displaying .00 for currency values like $10,000.00.
    }
}