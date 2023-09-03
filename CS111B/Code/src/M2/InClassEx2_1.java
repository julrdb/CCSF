package M2;

// For this assignment, work on the outputs on a paper. Test the codes and match your results.

public class InClassEx2_1 {
    public static void main(String[] args) {
            
//        //A. What output is produced by the following statements?
//        //1.)
//        String greeting = "How do you do";
//        System.out.println(greeting + "Seven of Nine.");
//            //Concatenated greeting obj and string "Seven of Nine."
//        //2.)
//        String test = "abcdefg";
//        System.out.println(test.length());
//        System.out.println(test.charAt(1));
//            //Returned 7 & b
//        //3.)
//        String test = "abcdefg";
//        System.out.println(test.substring(3));
//            //Ommitted abc and printed out defg
//        //4.)
//        System.out.println("abc\ndef");
//            //Printed abc then def on the next line
//        //5.)
//        System.out.println("abc\\ndef");
//            //Printed abc\ndef; one backslash ommitted
//        //6.)
//        String test = "Hello John";
//        test = test.toUpperCase();
//        System.out.println(test);
//            //Printed HELLO JOHN, all caps
//
//        //B. What is the value of the expression s1.equals(s2),  s2.equals(s1), s1.compareTo(s2) after the following
//        // statements execute?
//        //1.)
//        String s1 = "Hello John";
//        String s2 = "hello john";
//            //false; false; -32
//        //2.)
//        String s1 = "Hello John";
//        String s2 = "Hello john";
//            //false; false; -32
        //3.)
        String s1 = "Hello John";
        String s2 = "Hello Sam";
        s1 = s2.toUpperCase();
        s2 = s1.toUpperCase();
            //true; true; 0
        System.out.println("s1 = s2: " + s1.equals(s2));
        System.out.println("s2 = s1: " + s2.equals(s1));
        System.out.println("s1 to s2: " + s1.compareTo(s2));
    }
}
