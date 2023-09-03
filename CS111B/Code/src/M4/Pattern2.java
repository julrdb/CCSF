package M4;

//import java.util.Scanner;

public class Pattern2
{
  public static void main(String[] args)
  {
    char i,j;

    for (i='A';i<='D';i++)
    {
      for(j='A'; j<=i;j++)
      { 
        if(j<i)
          System.out.print('_');
        else
          System.out.print(j);
      }
      System.out.println();
    }
  }
}