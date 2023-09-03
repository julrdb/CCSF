package M7;

/**
* StringUtilDriver.java
* Mid-Term Review 1
* 
*/

public class StringUtilDriver{

	public static void main(String[] args){
		StringUtil s1 = new StringUtil("i love programming");
		StringUtil s2 = new StringUtil("madam im adam");
		System.out.println("Word count: "+s1.words());
		System.out.println("Palindrome? "+s1.isPalindrome());
		System.out.println("Palindrome? "+s2.isPalindrome());
		System.out.println("Vowel count: "+s2.vowels());


	}
}