package A3;

/*
3.) Write a program classify_age.java that asks the user to enter a person’s age. Then the program should display text indicating whether the person is an infant, a toddler, a child, a teenager, an adult, or a senior. It should display it just like this: “This person’s age category: x”, where x is
the person’s age category based on the following guidelines (5 points):

If less than 1 year old, the person is an infant.

If at least 1 year old but younger than 3, the person is a toddler.

If at least 3 years old but younger than 13, the person is a child.

If at least 13 years old but younger than 18, the person is a teenager.

If at least 18 years old but younger than 65, the person is an adult.

If 65 or older, the person is a senior.
*/

import java.util.Scanner;

public class classify_age {
    public static void main(String[] args) {
        float a;
        Scanner age = new Scanner(System.in);
        System.out.println("\nWhat is person X's age?");
        a = age.nextFloat();
        if ((a >= 0) && (a <= 1))
            System.out.println("Person X is an infant.\n");
        else if ((a >= 1) && (a < 3))
            System.out.println("Person X is a toddler.\n");
        else if ((a >= 3) && (a < 13))
            System.out.println("Person X is a child.\n");
        else if ((a >= 13) && (a < 18))
            System.out.println("Person X is a teenager.\n");
        else if ((a >= 18) && (a < 65))
           System.out.println("Person X is an adult.\n");
        else if (a >= 65)
            System.out.println("Person X is a senior.\n");
    }
}

//edited to disallow negative inputs.
//done!