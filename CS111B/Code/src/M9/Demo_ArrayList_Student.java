package M9;/* Demo_ArrayList_Student.java

Author- Anita Rathi

 */

  // Demo Class to test Array List 
import java.util.Scanner;
import java.util.ArrayList;

public class Demo_ArrayList_Student
{
    public static void main(String [] args)
    {
        ArrayList_Student A=new ArrayList_Student();
        Scanner input=new Scanner(System.in);
        A.Create();
        A.Display();
        System.out.println("Enter index of record to be deleted :");
        int n=input.nextInt();
        A.Delete_Record(n);
        A.Display();
        System.out.println("Enter index at which new record is to be added :");
        n=input.nextInt();
        A.Add_Record(n);
        A.Display();

    }
}


// Sample Output

// Enter Student name:
// James
// Enter Student number:
// 3
// Do you want to enter more record(1/0)
// 1
// Enter Student name:
// Rose
// Enter Student number:
// 2
// Do you want to enter more record(1/0)
// 1
// Enter Student name:
// Henry
// Enter Student number:
// 7
// Do you want to enter more record(1/0)
// 0
// The List has 3 records
// Name=James  Sno=3
// Name=Rose  Sno=2
// Name=Henry  Sno=7
// Enter index of record to be deleted :
// 1
// The deleted record is 
// Name=Rose  Sno=2
// The List has 2 records
// Name=James  Sno=3
// Name=Henry  Sno=7
// Enter index at which new record is to be added :
// 1
// Enter Student name:
// Joa
// Enter Student number:
// 10
// The List has 3 records
// Name=James  Sno=3
// Name=Joa  Sno=10
// Name=Henry  Sno=7

