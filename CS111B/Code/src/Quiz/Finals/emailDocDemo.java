package Quiz.Finals; //comment out the package if necessary; it's my package structure.

//import java.util.Scanner;

public class emailDocDemo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        Document doc1 = new Document();

        doc1.setText("This is my input. Java is actually a fun OOB language to learn. \nAt the beginning, it was overwhelmingly confusing. \nBut then the fundamentals and the logic that came with it started make more sense. \nPerhaps it's not as simple of a layout as with Python, yet it boasts powerful features. \nThank you James Gosling for your efforts into creating this powerful language. \nProfessor Rathi, you are awesome. Keep up the great work!");
        Email em1 = new Email(doc1, "juliustest@gmail.com","anithatest@gmail.com","Final Exam demo");
        System.out.println("------1------");
        System.out.println(em1);
        System.out.println();
        Email em2 = new Email(em1);
        em2.setAll("This is second test; testing setAll from class Email.","sender@gmail.com", "recipient@gmail.com", "2nd email");
        System.out.println("------2------");
        System.out.println(em2);
        System.out.println();
        System.out.println("------3------");
        em2.setText("Change the text for Email object em2");
        System.out.println(em2);

    }
}
