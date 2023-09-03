package M6;

import java.util.Scanner;

public class demo_copyConstructorExample{
  public static void main(String[] args) {
    copyConstructorExample C1=new copyConstructorExample();
    C1.setNum(5);
    C1.change();
    System.out.println(C1);
    copyConstructorExample C2=C1;
    C2.setNum(20);
    System.out.println(C2);
    System.out.println(C1);

    //usage of copy constructor
    copyConstructorExample C3=new copyConstructorExample(C1);
    C1.change();
    System.out.println(C1);
    System.out.println(C3);


  }

}