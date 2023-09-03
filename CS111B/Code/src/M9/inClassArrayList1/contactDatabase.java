package M9.inClassArrayList1;

import java.util.*;

public class contactDatabase {
    public static class Contact {
        private String firstName,lastName,phoneNumber,email;

        Contact(String fN,String lN, String pN, String email) {
            firstName = fN;
            lastName = lN;
            phoneNumber = pN;
            this.email = email;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String getEmail() {
            return email;
        }
        public void setFirstName(String fN) {
            firstName = fN;
        }
        public void setLastName(String lN) {
            lastName = lN;
        }
        public void setPhoneNumber(String pN) {
            phoneNumber = pN;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public boolean equals(Contact other) {
            return(firstName.equals(other.firstName)&&lastName.equals(other.lastName)&&phoneNumber.equals(other.phoneNumber)&&email.equals(other.email));
        }
        public String toString() {
            return("First Name: "+getFirstName()+"\nLast Name: "+getLastName()+"\nPhone Number: "+getPhoneNumber()+"\nemail address: "+getEmail());
        }

    }
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Contact> contactArrayList = new ArrayList<>();
    public static String searchString;
    private static void addContact(Contact newContact) {
        contactArrayList.add(newContact);
    }
    public static void displayAll() {
        for(Contact c: contactArrayList)
            System.out.println(c);
    }
    public static void searchDisplay() {
        System.out.println("Enter a search phrase: ");
        searchString = sc.next();
        for(Contact c: contactArrayList) {
            if(c.getFirstName().contains(searchString) || c.getLastName().contains(searchString) || c.getPhoneNumber().contains(searchString) || c.getEmail().contains(searchString))
                System.out.println(c);
        }
    }

    public static void searchDelete() {
        System.out.println("Enter a search phrase: ");
        searchString = sc.next();
        contactArrayList.removeIf(c ->c.getFirstName().contains(searchString) || c.getLastName().contains(searchString) || c.getPhoneNumber().contains(searchString) || c.getEmail().contains(searchString));

    }

    public static void main(String[] args) {
        boolean repeat = true;
        do {
            System.out.println("Welcome to the database.");
            System.out.println("\t1. Add Contact\n\t2. Display all Contacts\n\t3. Search and display\n\t4. Search and delete\n\t5. Exit\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter First name: ");
                    String fN = sc.next();
                    System.out.println("Enter Last name: ");
                    String lN = sc.next();
                    System.out.println("Enter Phone number: ");
                    String pN = sc.next();
                    System.out.println("Enter email address: ");
                    String email = sc.next();
                    Contact c1 = new Contact(fN, lN, pN, email);
                    addContact(c1);
                }
                case 2 -> displayAll();
                case 3 -> searchDisplay();
                case 4 -> searchDelete();
                case 5 -> repeat = false;
                default-> System.out.println("Error, wrong input. ");
            }
        }
        while (repeat);
    }
}
