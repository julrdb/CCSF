package M9;/* ArrayList_Student.java

Author- Anita Rathi
  This program demonstrates :
  - ArrayList of Student (class)
  - for each loop

 */
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_Student
{    private ArrayList <Student> S= new ArrayList<Student>();
    
    private Scanner input=new Scanner(System.in);
    
    public void Create()
    {
     
        int repeat;
        do
        {
            Student temp=new Student();
            String n;
            int no;
            System.out.println("Enter Student name:");
            n=input.next();
            System.out.println("Enter Student number:");
            no=input.nextInt();
            temp.set(n,no);
            S.add(temp);
            System.out.println("Do you want to enter more record(1/0)");
            repeat=input.nextInt();
        }while(repeat==1);

    }

    public void Display()
    {     
        
        System.out.println("The List has " + S.size() + " records");
        for(Student x:S)
            System.out.println(x);
        System.out.println(S);
        
    }

    public void Add_Record(int index)//Adds record at given index
    {
        String n;
        int no;
        Student temp=new Student();
        System.out.println("Enter Student name:");
        n=input.next();
        System.out.println("Enter Student number:");
        no=input.nextInt();
        temp.set(n,no);
        S.add(index,temp);
        System.out.println(S.contains(temp)); //searching for temp in Arraylist
    }

    public void Delete_Record(int index)
    {
        Student temp=S.remove(index);
        System.out.println("The deleted record is ");
        System.out.println(temp);
    }

}

