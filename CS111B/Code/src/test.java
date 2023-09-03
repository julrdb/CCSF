//import java.util.Scanner;
//
public class test {
//    public String[] phrase = {"banana is yellow", "this is not a drill", "teach me how", "the path less traveled", "beware of dogs", "a b c d e f g!!!"};
//
//    public String chosen = phrase[(int)(Math.random()*phrase.length)];
//
//    public String hideWord() {
//        StringBuilder sb = new StringBuilder(chosen);
//        for(int i=0; i<chosen.length(); i++) {
//            if(sb.charAt(i) == ' ')
//                sb.setCharAt(i, ' ');
//            else
//                sb.setCharAt(i,'*');
//        }
//        return sb.toString();
//    }
//
    public static void main(String[] args) {
//        test t = new test();
//        System.out.println(t.hideWord());

//        String[] phrase = {"banana is yellow", "this is not a drill", "teach me how", "the path less traveled", "beware of dogs"};
//
//        String chosen = phrase[(int)(Math.random()*phrase.length)];

        String test = "one two three four five six seven eight nine ten eleven twelve";
        int counter=0;
        for(int i=0; i<test.length(); i++) {
            if(test.charAt(i) == ' ') {
                counter++;
            }
            if(counter < 7) {
                String trimmed = test.replaceAll("\\s", ",");
                System.out.print(trimmed.charAt(i));
            }
        }
        System.out.print(".");
    }
}
