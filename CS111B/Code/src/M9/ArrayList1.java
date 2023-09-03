package M9;/* ArrayList1.java

Author- Anita Rathi
  This program demonstrates :
  - ArrayList of String
  - add()
  - get()
  - remove()
  - size()

 */

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1
{
		private static ArrayList<String> letters=new ArrayList<String>(5);
	

		public void letterrem()
		{	letters.add("A");
			letters.add("B");
			letters.add("A");
			letters.add("C");
			int i=0;
			while(i<letters.size())
			{
				if(letters.get(i).equals("A"))
					letters.remove(i);
				i++;
			}
			System.out.println(letters);
			System.out.println(letters.size());
		}

		public void Change()
		{
			letters.add("Alpha");
			letters.add("G");
			letters.add("8");
			letters.add("R");
			letters.add("D");//Adds the element at end
			letters.add(3,"E");//Adds the element at index 3
			letters.add("F");

			letters.remove("D");//Removes the first occurence of D
			System.out.println(letters);
			String temp=letters.set(4,"Beta");//original value is returned
			System.out.println(letters);
			System.out.println(letters.size());
			System.out.println("Previous value at index 4=" + temp);
			

		}	

		public static void main(String Args[])
		{
			ArrayList1 T=new ArrayList1();
			
			T.letterrem();
			T.Change();
			

		}

}
