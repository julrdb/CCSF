package M1.InClassEx1_1;

//3. Write a program to take the input of two numbers and then swap their values. Your code should display the original and the modified  values of the variables .
import java.util.Scanner;

class ICEx113 {  
    public static void main(String[] args) {  
       int x, y, z; 
       Scanner a = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = a.nextInt();  
       y = a.nextInt();  
       System.out.println("before swapping numbers: " + x + " " + y);     
       z = x;
       x = y;  
       y = z;
       System.out.println("After swapping: " + x + " " + y);
    }    
}  