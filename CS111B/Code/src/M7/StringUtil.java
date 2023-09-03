package M7;
/*
* StringUtil.java
* Mid-Term Review 1
* 
*/

//import java.util.Scanner;

public class StringUtil{
	private String str;

	public StringUtil(String str){
		this.str = str;
	}

	public int words(){
		
		int count = 0;
		for (int i=0; i<str.length(); i++)
			if(str.charAt(i)==' ')
				count++;
		return count+1; //number of words=number of spaces +1
	}

	public boolean isPalindrome(){
		String noSpace = str.replaceAll("\\s","");
		StringBuilder reverse= new StringBuilder();//finding the reverse of string
		for(int i = noSpace.length() -1; i>=0; i--)
			reverse.append(noSpace.charAt(i));
		return noSpace.equals(reverse.toString());
	}

	public int vowels(){
		int vowels = 0;
		char letter;//wrapper class
		for(int count = 0; count <str.length(); count++){
			letter = str.charAt(count);
			letter=Character.toLowerCase(letter);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || 
				letter == 'u'){
				vowels++;
			}
		}
		return vowels;
	}
}