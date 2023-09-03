package M9.inClassArrayList1;

import java.util.*;

public class diveScoring {
    public static Scanner sc = new Scanner(System.in);

    public static void diving() {
        ArrayList<Float> scores = new ArrayList<>(7);
        for(int i=0;i<7;i++) {
            System.out.println("Please enter judge "+(i+1)+"'s score (1-10): ");
            scores.add(sc.nextFloat());
        }
        float lowest=10, highest=0;
        for (Float i : scores) {
            if (i < lowest)
                lowest = i;
            if (i > highest)
                highest = i;
        }
        scores.remove(lowest);
        scores.remove(highest);

        float totalScore=0;
        for (Float i : scores)
            totalScore += i;

        float difficulty=0;
        System.out.println("Dive difficulty level (1.2-3.8): ");
        difficulty = sc.nextFloat();
        System.out.printf("Overall score: %.2f",(totalScore*difficulty*0.6));
        //return(totalScore*difficulty*0.6f);
    }



    public static void main(String[] args) {
        diving();
    }

}
