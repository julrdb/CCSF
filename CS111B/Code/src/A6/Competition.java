package A6;

public class Competition {
    private String competitionName, winningTeam, runnerUp;
    private int competitionYear;

    public Competition() { //default constructor
        competitionName = winningTeam = runnerUp = "_";
        competitionYear = 0;
    }

    public Competition(String compName, int compYear, String winTeam, String runUp) {
        competitionName = compName;
        competitionYear = compYear;
        winningTeam = winTeam;
        runnerUp = runUp;

    }
    public Competition(Competition copy) { //copy constructor
        competitionName = copy.competitionName;
        competitionYear = copy.competitionYear;
        winningTeam = copy.winningTeam;
        runnerUp = copy.runnerUp;

    }

    public String getCompetitionName() {
        return competitionName;
    }
    public String getWinningTeam() {
        return winningTeam;
    }
    public String getRunnerUp() {
        return runnerUp;
    }
    public int getCompetitionYear() {
        return competitionYear;
    }
    public void setAll(String compName, String winTeam, String runUp, int compYear) {
        this.competitionName = compName;
        this.winningTeam = winTeam;
        this.runnerUp = runUp;
        this.competitionYear = compYear;
    }
    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }
    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }
    public void setRunnerUp(String runnerUp) {
        this.runnerUp = runnerUp;
    }
    public void setCompetitionYear(int competitionYear) {
        this.competitionYear = competitionYear;
    }
    public String toString() {
        return (getCompetitionYear()+" "+getCompetitionName()+
                "\nWinning team: "+getWinningTeam()+
                "\nRunner up: "+getRunnerUp());
    }
    public boolean equals(Competition other) {
        return ((this.competitionYear==other.competitionYear) && (this.competitionName== other.competitionName) && (this.winningTeam==other.winningTeam) && (this.runnerUp== other.runnerUp));
    }
}
