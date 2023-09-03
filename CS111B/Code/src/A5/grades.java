package A5;
import java.util.Scanner;
public class grades {
    //instance variables
    private double quiz1, quiz2, quiz3, midTerm, finals, numericScore;
    private String letterGrade;
    //constructors
    public grades(double q1, double q2, double q3, double mT, double fnl, double nS) {
        quiz1 = q1;
        quiz2 = q2;
        quiz3 = q3;
        midTerm = mT;
        finals = fnl;
        numericScore = nS;
    }
    //getters
    public double getQuizzes() {
        return ((quiz1+quiz2+quiz3)*10/3);
    }
    public double getMidTerm() {
        return midTerm;
    }
    public double getFinals() {
        return finals;
    }
    public double getNumericScore() {
        return((getQuizzes()+getMidTerm()+getFinals())/3);
    }
    public double getWeightedScore() {
        return (weightedQuizzes()+weightedMidTerm()+weightedFinals());
    }
    public String getLetterGrade() {
        return letterGrade;
    }
    //setters
    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
    //Misc
    //I should have a allQuizzes getter to weight average the three quizzes.
    public double weightedQuizzes() {
        return (getQuizzes()*0.25);
    }
    public double weightedMidTerm() {
        return (getMidTerm()*0.35);
    }
    public double weightedFinals() {
        return (getFinals()*0.4);
    }
    public String toString() {
        return ("Quiz1: "+quiz1+"; Quiz2: "+quiz2+"; Quiz3: "+quiz3+"\nMidTerm: "+String.format("%.2f",midTerm)+"\nFinals: "+String.format("%.2f",finals)+
                "\nTotal numeric score: "+String.format("%.2f",getNumericScore()));
    }
    public boolean equalz (grades other) {
        return ((this.getNumericScore()==other.getWeightedScore()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nS = 0;
        System.out.println("Q1, Q2, Q3 score pls: ");
        double q1 = sc.nextDouble();
        double q2 = sc.nextDouble();
        double q3 = sc.nextDouble();
        System.out.println("Now enter your midterm and finals scores:");
        double mT = sc.nextDouble();
        double fnl = sc.nextDouble();
        grades g = new grades(q1,q2,q3,mT,fnl,nS);
        grades gW = new grades(q1,q2,q3,mT,fnl,nS);
        System.out.println(g);
        System.out.println("\nHere are the weighted score breakdown:");
        System.out.println("Quizzes (weight factor 0.25): "+String.format("%.2f",g.weightedQuizzes())+"\nMidTerm (weight factor 0.35): "+String.format("%.2f",g.weightedMidTerm())+"\nFinals (weight factor 0.4): "+String.format("%.2f",g.weightedFinals()));
        System.out.println("Total weighted score: "+String.format("%.2f",gW.getWeightedScore()));

        if(g.getWeightedScore()>=90) {
            g.setLetterGrade("A");
            System.out.println("Your grade is: "+g.getLetterGrade());
        }
        else if((g.getWeightedScore()>=80) && (g.getWeightedScore()<90)) {
            g.setLetterGrade("B");
            System.out.println("Your grade is: "+g.getLetterGrade());
        }
        else if((g.getWeightedScore()>=70)&&(g.getWeightedScore()<80)) {
            g.setLetterGrade("C");
            System.out.println("Your grade is: "+g.getLetterGrade());
        }
        else if((g.getWeightedScore()>=60)&&(g.getWeightedScore()<70)) {
            g.setLetterGrade("D");
            System.out.println("Your grade is: "+g.getLetterGrade());
        }
        else if(g.getWeightedScore()<60) {
            g.setLetterGrade("F");
            System.out.println("Your grade is: "+g.getLetterGrade());
        }
//        if(g.getNumericScore()==gW.getWeightedScore())
//            System.out.println("\nNumeric score is equivalent to the weighted score.");
//        else
//            System.out.println("\nNumeric and weighted scores are NOT equivalent.");
        g.getNumericScore();
        gW.getWeightedScore();
        if(g.equalz(gW))
            System.out.println("\nNumeric score is equivalent to the weighted score.");
        else
            System.out.println("\nNumeric and weighted scores are NOT equivalent.");
        System.out.println("\nThe end...");
    }
}
//Could we use one instance variable to hold multiple values simultaneously when invoked?
//overall score becomes weighted to 100pts (convert each scores to 100pt weight).