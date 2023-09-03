package A6;
import java.util.Scanner;

public class hackathonMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*Scenario:
        Log 2 year season hackathon league (use year 2018 and 2019)
        Each year, 2 competitions (call it like HackSpring, Hacktober)
        SForce:
            Matt
            Kelly
            Miles
            Jared
        BASquad:
            Alex
            Jazz
            Mike
            Kyle
        */

        Competition firstHalf2018 = new Competition("HackSpring", 2018, "SForce","BASquad");
        Competition secondHalf2018 = new Competition("Hacktober", 2018, "SForce", "BASquad");
        Competition firstHalf2019 = new Competition(firstHalf2018);
        firstHalf2019.setCompetitionYear(2019);
        firstHalf2019.setWinningTeam("BASquad");
        firstHalf2019.setRunnerUp("SForce");
        Competition secondHalf2019 = new Competition(secondHalf2018);
        secondHalf2019.setCompetitionYear(2019);

        Team SForceS1 = new Team("SForce","Matt","Kelly","Miles","Jared",firstHalf2018,secondHalf2018);
        Team BASquadS1 = new Team(SForceS1);
        BASquadS1.setTeam("BASquad","Alex","Jazz","Mike","Kyle");
        Team SForceS2 = new Team(SForceS1);
        SForceS2.setComp(firstHalf2019,secondHalf2019);
        Team BASquadS2 = new Team(BASquadS1);
        BASquadS2.setComp(firstHalf2019,secondHalf2019);

        //Verify copy constructor is NOT changing original constructor:
        System.out.println(SForceS1);
        System.out.println(firstHalf2019);
        System.out.println(secondHalf2019);
        System.out.println("\n");
        System.out.println(BASquadS1);
        System.out.println(firstHalf2019);
        System.out.println(secondHalf2019);

    }
}
