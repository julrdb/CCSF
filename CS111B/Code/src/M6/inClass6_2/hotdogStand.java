package M6.inClass6_2;

public class hotdogStand {
    //instance variables
    private int idNumber, numHotdogs;
    private static int totalHotdogs;

    //constructor
    public hotdogStand() {
        idNumber = 100;
        numHotdogs = 0;
    }
    public hotdogStand(int id,int nHotdogs) {
        idNumber = id;
        numHotdogs = nHotdogs;
        totalHotdogs += nHotdogs;
    }
    public static int allHotdogs() {
        return totalHotdogs;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public int getNumhotdogs() {
        return numHotdogs;
    }
    public int getTotalHotdogs() {
        return totalHotdogs;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public void setNumHotdogs(int numHotdogs) {
        this.numHotdogs = numHotdogs;
    }
    public void justSold() {
        numHotdogs++;
        totalHotdogs++;
    }
    public String toString() {
        return("\nStand ID "+getIdNumber()+"\nHotdogs sold: "+ getNumhotdogs());
    }

    public boolean equals(hotdogStand other) {
        return((idNumber == other.idNumber) && (getNumhotdogs() == other.getNumhotdogs()));
    }
}

