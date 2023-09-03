
import java.util.Scanner;

public class Test1_Byte {
    public static void main(String[] args) {
        //byte x = 120, y = 120;
        //byte z = x + y;
        //System.out.println(x + y);
        //ASCII = American Standard Code for International Interchange
        char grade1='A', grade2='9', grade3='&'; //character variable
        String s="test";
        System.out.println((char)(grade1+1));
        //if you remove (char), printing (grade1+1) will display ASCII decimal location of A (which is 65) and +1 = so 66.
        //remove the (char) and +1 after grade1, and it'll print the character value, A.

        //boolean flag = true;

        System.out.println((float)12/5);
        //this only converts the next closest operand, 12 into float
        System.out.println((float)(12/5));
        //will solve 12/5 before it converts it to float
    }
}
