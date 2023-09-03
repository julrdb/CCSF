package M7.inClass7_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringUtil {
    //instance variables
    private String str;

    public StringUtil(String str) {
        this.str = str;
    }

    //methods
    public static int wordCount(String str) {
        StringTokenizer sT = new StringTokenizer(str);
            return sT.countTokens();
    }
    public static String isPalindrome(String str) {
        String noSpace = str.replaceAll("\\s","");
        StringBuilder sb = new StringBuilder(noSpace);
        if(noSpace.equals(String.valueOf(sb.reverse())))
            return("is a palindrome");
        else
            return("is NOT a palindrome");
    }

    public static int vowels(String str) {
        int counter = 0;
        for(int i=0; i<str.length(); i++) {
            if((str.charAt(i) == 'a')||(str.charAt(i) == 'e')||(str.charAt(i) == 'i')||(str.charAt(i) == 'o')||(str.charAt(i) == 'u'))
                counter++;
            }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1, word2;
        System.out.println("Enter first word: ");
        word1 = sc.nextLine().toLowerCase();
        System.out.println("Second word: ");
        word2 = sc.nextLine().toLowerCase();
        System.out.println("Word1 word count: "+wordCount(word1));
        System.out.println("Word2 word count: "+wordCount(word2));
        System.out.println("Word1 "+isPalindrome(word1));
        System.out.println("Word2 "+isPalindrome(word2));
        System.out.println("Word1 # of vowels: "+vowels(word1));
        System.out.println("Word2 # of vowels: "+vowels(word2));
    }
}
