package A6;

public class
Team {

    private String teamName, name1, name2, name3, name4;
    private Competition comp1, comp2;

    public Team() { //default constructor
        teamName = "";
        name1 = "player1";
        name2 = "player2";
        name3 = "player3";
        name4 = "player4";
        comp1 = comp2 = null;
    }

    //parameterized constructor
    public Team(String tN,String n1, String n2, String n3, String n4, Competition c1, Competition c2) {
        teamName = tN;
        name1 = n1;
        name2 = n2;
        name3 = n3;
        name4 = n4;
        comp1 = new Competition(c1);
        comp2 = new Competition(c2);
    }
    //copy constructor
    public Team(Team copy) {
        teamName = copy.teamName;
        name1 = copy.name1;
        name2 = copy.name2;
        name3 = copy.name3;
        name4 = copy.name4;
        comp1 = new Competition(copy.comp1); //deep copy
        comp2 = new Competition(copy.comp2); //deep copy
    }
    public void setTeam(String tN,String n1, String n2, String n3, String n4) {
        teamName = tN;
        name1 = n1;
        name2 = n2;
        name3 = n3;
        name4 = n4;
    }
    public void setComp(Competition c1, Competition c2) {
        comp1 = c1;
        comp2 = c2;
    }
    public String toString() {
        return("Team name: "+teamName+
                "\nTeam members: "+
                "\n"+name1+
                "\n"+name2+
                "\n"+name3+
                "\n"+name4+
                "\n--Leaderboard--"+
                "\n"+comp1+
                "\n"+comp2);
    }

}
