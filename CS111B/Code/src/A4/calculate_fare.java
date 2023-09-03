package A4;
/*
1. Write a Java program calculate_fare.java to take the input for number of miles, and the class of journey (1,2, or 3, for first, second, and third class respectively), for a train journey.
The program should then calculate and display the fare of journey based on the following criteria:
Note: Use Switch...case and if...else construct
*/

import java.util.Scanner;

public class calculate_fare {
    public static void main(String[] args) {
        boolean repeat = true;
        while(repeat) {  //running a while loop because user may want to find info for multiple trips.
            int tripClass;
            Scanner m = new Scanner(System.in);
            System.out.print("\nWhich class will you be in? ");
            tripClass = m.nextInt();

            //user chooses between class 1, 2, or 3, and will be ask how long their trip will be.
            //at each case, mileage boundaries are created using if and if-else statements. This essentially creates a trip categorized by distance as follow: 0-100, 101-150, and 151 & beyond.
            //when the user enters its desired travel distance, it will fall under one of the if/if-else statements and prints out a summary of cost per mile and total cost of trip according to user's input.
            switch (tripClass) {
                case 1 -> {
                    System.out.print("How long (distancewise) will your journey be? ");
                    double dist1 = m.nextDouble();
                    if ((dist1 >= 0) && (dist1 <= 100))
                        System.out.printf("It will cost $3.00/mile. Your total will be $%.2f", dist1 * 3);
                    else if ((dist1 >= 101) && (dist1 <= 150))
                        System.out.printf("It will cost $2.50/mile. Your total will be $%.2f", dist1 * 2.5);
                    else if (dist1 >= 151)
                        System.out.printf("It will cost $2.00/mile. Your total will be $%.2f", dist1 * 2);
                }
                case 2 -> {
                    System.out.print("How long (distancewise) will your journey be? ");
                    double dist2 = m.nextDouble();
                    if ((dist2 >= 0) && (dist2 <= 100))
                        System.out.printf("It will cost $3.00/mile. Your total will be $%.2f", dist2 * 3);
                    else if ((dist2 >= 101) && (dist2 <= 150))
                        System.out.printf("It will cost $2.50/mile. Your total will be $%.2f", dist2 * 2.5);
                    else if (dist2 >= 151)
                        System.out.printf("It will cost $2.00/mile. Your total will be $%.2f", dist2 * 2);
                }
                case 3 -> {
                    System.out.print("How long (distancewise) will your journey be? ");
                    double dist3 = m.nextDouble();
                    if ((dist3 >= 0) && (dist3 <= 100))
                        System.out.printf("It will cost $3.00/mile. Your total will be $%.2f", dist3 * 3);
                    else if ((dist3 >= 101) && (dist3 <= 150))
                        System.out.printf("It will cost $2.50/mile. Your total will be $%.2f", dist3 * 2.5);
                    else if (dist3 >= 151)
                        System.out.printf("It will cost $2.00/mile. Your total will be $%.2f", dist3 * 2);
                }
                default -> System.out.println("Oops, you may have typed an incorrect input."); //On this part, unfortunately, I can't find a way to return back up to the while statement. I wanted it to run the program from the top again when user puts anything other than 1,2, or 3, without using a questionnaire.
            }
            System.out.print("\nWould you like to check for another trip(True/False)? "); //once the program is completed, the code will ask the user to check for another trip. User needs to answer true or false. Their input is not case-sensitive. i.e. TRUE, true, True, tRUE are all valid.
            repeat = m.nextBoolean();
        }
        System.out.println("\nEnjoy your trip!");
    }
}
/*Requirements:
Use of Switch case construct
Use of if...else construct
*/
//Need to make sure we use System.out.printf("$%.2f",price)