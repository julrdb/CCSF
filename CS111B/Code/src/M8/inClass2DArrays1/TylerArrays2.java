package M8.inClass2DArrays1;

import java.util.Scanner;
public class TylerArrays2
{
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Scanner userInput = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = userInput.nextInt();
		System.out.println("Enter number of columns");
		int column = userInput.nextInt();
		
		int[][] numArray = new int[row][column];
		
		
		Input(numArray);
		Display(numArray);
		SumCol(numArray);
	}
	
	public static void Input(int[][] A)
	{
		//Scanner userInput = new Scanner(System.in);
		for(int ii = 0; ii < A.length; ii++)
		{
			for(int jj = 0 ; jj < A[ii].length; jj++)
			{
				System.out.print("A[row"+(ii+1)+"][col"+(jj+1)+"] = ");
				A[ii][jj] = userInput.nextInt();
			}
		}
	}
	
	public static void Display(int[][] A)
	{
		for(int ii = 0; ii < A.length; ii++)//rows
		{
			for(int jj = 0 ; jj < A[ii].length; jj++)//column
			{
				System.out.printf("%5d",A[ii][jj]);
			}
			System.out.print("\n");
		}
	}
	
	public static void SumCol(int[][] A)
	{
		for(int jj = 0 ; jj < A[0].length; jj++)//column
		{
			int sum = 0;
			for(int ii = 0; ii < A.length; ii++)//rows
			{
				sum += A[ii][jj];
			}
			System.out.println("Sum of elements on column "+ (jj+1) +" = "+sum);
		}
	}
}
