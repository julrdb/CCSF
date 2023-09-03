package M8.inClass2DArrays1;

import java.util.Scanner;
public class inClassArrays2 {
    public static Scanner sc = new Scanner(System.in);

    public static void input(int[][] A) {
        for(int r=0;r<A.length;r++) {
            //A.length automatically assumes length of row.
            for(int c=0;c<A[0].length;c++) {
                //A[0] or A[r] assumes length of column)
                System.out.println("row length "+A.length+"\ncolumn length "+A[0].length);
                System.out.print("[row"+(r+1)+"][col"+(c+1)+"] = ");
                A[r][c] = sc.nextInt();
            }
        }
    }
    public static void display(int[][] A) {
        System.out.println("---------------------------------");
        for (int r=0;r<A.length;r++) {
            for (int c = 0; c < A[0].length; c++) {
                System.out.printf("%5d", A[r][c]);
            }
            System.out.print("\n");
        }
        System.out.println("---------------------------------");
    }
    public static void SumCol(int [][] A) {
        for(int c=0;c<A[0].length;c++) {
            int tot = 0;
            for (int r=0;r<A.length;r++) {
                tot += A[r][c];
            }
            System.out.println("Sum of elements on column "+ (c+1) +" = "+tot);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int column = sc.nextInt();
        int[][] numArray = new int[row][column];

        input(numArray);
        display(numArray);
        SumCol(numArray);
    }
}
