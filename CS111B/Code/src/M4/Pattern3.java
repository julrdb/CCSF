package M4;

//import java.util.Scanner;

public class Pattern3
{
  public static void main(String[] args)
  {
    int i,j,k;

    for (i=1;i<=4;i++)
    { 
      for(k=1;k<=4-i;k++)
        System.out.print(" ");
      for(j=1; j<=i;j++)
        System.out.print("#");      
      System.out.println();
    }
  }
}