package M4;

//import java.util.Scanner;

public class Pattern1
{
  public static void main(String[] args)
  {
    char i,j;

    for (i='A';i<='D';i++) //when nested for loop completes iteration, goes up this line and ups the i value after i++. So i='B', then 'C',...
    {
      for(j='A';j<=i;j++) //This keeps iterating until j does not evaluate to i.
      { 
          System.out.print(j); 
      }
      System.out.println();
    }
  }
}