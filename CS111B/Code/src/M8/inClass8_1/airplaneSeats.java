package M8.inClass8_1;

import java.util.Scanner;

public class airplaneSeats {
    private static String[][] seat = {{"A", "B", "C", "D"},{"A", "B", "C", "D"},{"A", "B", "C", "D"},{"A", "B", "C", "D"},{"A", "B", "C", "D"},{"A", "B", "C", "D"},{"A", "B", "C", "D"}};
    public static int booked, tries;
    public static boolean play, booking;

    public static Scanner sc = new Scanner(System.in);

    public static void display() {
        System.out.print(""" 
              /^\\      
             /   \\      
            /     \\     
           /       \\   
          /         \\   
         /           \\  
        (             ) 
        """);
        for(int i=0; i < seat.length; i++ ) {
            System.out.print("|  "+(i+1)+" ");
            for(int j=0; j < seat[i].length; j++) {
                System.out.print(seat[i][j]+" ");
            }
            System.out.print(" |");
            System.out.println();
        }
        System.out.print("""
        |.............|
        """);
    }
    public static void book() {
            System.out.print("Enter the seat row (1-7): ");
            while(!sc.hasNext("[1-7]")) {
                System.out.println("Wrong row, try again. ");
                sc.nextInt();
            }
            int row = sc.nextInt();
            System.out.print("Enter seat column (a-d or A-D): \n");
            while(!sc.hasNext("[a-d, A-D]")) {
                System.out.println("Wrong column, try again. ");
                sc.next();
            }
            String userSeat = sc.next();
            int column=0;
            if (userSeat.equalsIgnoreCase("A"))
                column = 1;
            else if (userSeat.equalsIgnoreCase("B"))
                column = 2;
            else if (userSeat.equalsIgnoreCase("C"))
                column = 3;
            else if (userSeat.equalsIgnoreCase("D"))
                column = 4;

            if (seat[row-1][column-1].equalsIgnoreCase("X")) {
                System.out.println("Already booked, try something else");
            }
            else {
                seat[row-1][column-1] = "X";
                booked++;
            }
    }
    public static void main(String[] args) {
        play = true;
        tries = 0;
        booked = 0;
        while(play) {
            display();
            book();
            tries++;
            if(tries==7) {
                System.out.println("Do you want to book more flights (true/false)? ");
                play = sc.nextBoolean();
                tries=0;
            }
            if (booked == 28) {
                System.out.println("Seats are full!");
                play = false;
                //System.exit(0);
            }
        }
        System.out.println("-------------------------------"+"\nLast booking overview:");
        display();
        System.out.println("Thank you for booking with Experiment Airlines. Have a safe flight!");
    }
}
