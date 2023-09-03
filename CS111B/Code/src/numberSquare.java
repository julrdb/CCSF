
import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Want to square a number (1/0)? ");
        int answer = sc.nextInt();
        while(answer==1) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println(n + "² = " + (n * n));
            System.out.println("Do you want to repeat(1/0)? ");
            answer = sc.nextInt();
        }
    }
}