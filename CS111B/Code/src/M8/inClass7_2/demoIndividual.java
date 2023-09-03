package M8.inClass7_2;

import java.util.Scanner;

public class demoIndividual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many entries you want to create? ");
        int entry = sc.nextInt();
        individual [] phoneBook = new individual[entry];
        for (int i=0;i<phoneBook.length;i++) {
            phoneBook[i] = new individual();
            System.out.println("Enter the name for entry "+(i+1)+": ");
            phoneBook[i].setName(sc.next());
            System.out.println("Enter the phone number: ");
            phoneBook[i].setPhoneNumber(sc.next());
        }

        boolean search = true;
        while(search) {
            System.out.println("Enter a name to search: ");
            String nameToSearch = sc.next();
            for(int i=0;i< phoneBook.length;i++) {
                if(nameToSearch.equalsIgnoreCase(phoneBook[i].getName())) {
                    System.out.println(phoneBook[i]);
                    search = false;
                }
            }
            if(search) {
                System.out.println("No record found.");
                System.out.println("Try searching again? ");
                search = sc.nextBoolean();
            }
        }
        System.out.println("End of program.");
    }
}
