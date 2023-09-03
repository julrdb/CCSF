package M9.inClass7_inheritance1;

//import java.util.Scanner;

public class DoctorDemo {
    public static void main(String[] args) {
        Doctor blank1 = new Doctor();
        Doctor blank2 = new Doctor();
        Doctor docDan = new Doctor("Danny Wang",new Date2("Sep",5,1968),"Neurologist",101.52);
        System.out.println(blank1);

        if(blank1.equals(blank2))
            System.out.println("They match");
        else
            System.out.println("Not match");

        System.out.println(docDan);

        if(docDan.equals(blank1))
            System.out.println("They match");
        else
            System.out.println("Not match");


    }

}
