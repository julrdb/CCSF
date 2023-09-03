package M8.inClassArrays1;
import java.util.Scanner;
public class inClassArrays1 {

    public static Scanner sc = new Scanner(System.in);
    public static int[] array = new int[10];
    //method 1
    public static String minMaxVal() {
        int maxVal = array[0];
        int minVal = array[0];
        for (int j : array) {
            if (j > maxVal)
                maxVal = j;
            if (j < minVal)
                minVal = j;
        }
        return("Min val: "+minVal+"\nMax val: "+maxVal);
    }
    //method 2
    public static boolean prime(int n) {
        for(int i=2;i<=n/2;i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    //method 3
    public static void replace(int o,int r) {
        for(int j : array) {
            if(j == o)
                j = r;
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<array.length;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(minMaxVal());

        System.out.println("Current array values: ");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]);
            if(i<array.length-1)
                System.out.print(",");
        }
        System.out.println(".");

        //Print prime inputs down here.
        System.out.println("Prime numbers: ");
        int countPrime=0;
        for(int i=0;i<array.length;i++) {
            if(prime(array[i])) {
                countPrime++;
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("\nPrime occurrence: "+countPrime);
        System.out.println("\nEnter the number to be replaced: ");
        int original = sc.nextInt();
        System.out.println("Enter the number to replace the original: ");
        int replacement = sc.nextInt();
        replace(original, replacement);
    }
}
