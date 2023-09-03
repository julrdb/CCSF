package M5.inClass5_2;

import java.util.Scanner;

public class journalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BlogEntry b1 = new BlogEntry("julrdb","this is a test","June",12,2015);
        BlogEntry b2 = new BlogEntry();
        BlogEntry b3 = new BlogEntry();

        System.out.println(b1+"\n");
        System.out.println(b2+"\n");
        System.out.println(b3+"\n");


        if(b1.equals(b2))
            System.out.println("b1 & b2 are equal");
        else
            System.out.println("b1 & b2 NOT equal");

        if(b2.equals(b3))
            System.out.println("b2 & b3 are equal");
        else
            System.out.println("NOT equal");
    }
}
