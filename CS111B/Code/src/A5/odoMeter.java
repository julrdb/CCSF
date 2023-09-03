package A5;
import java.util.Scanner;
public class odoMeter {
    //instance variables
    private float milesDriven, gallons, efficiency;
    //constructor
    public odoMeter(float mD, float gal) {
        milesDriven = mD;
        gallons = gal;
    }
    //getters
    public float getMilesDriven() {
        return milesDriven;
    }
    public float getGallons() {
        return gallons;
    }
    public float getEfficiency() {
        return efficiency;
    }
    //setters
    public void setOdometerToZero() { //to reset odometer to 0.
        this.milesDriven = 0;
    }
    public void setTotalOdometer(float milesDriven) { //accepts milesDriven, adds to odometer total trip.
        this.milesDriven += milesDriven;
    }
    public void setTotalGallons(float gallons) {
        this.gallons += gallons;
    }
    public void setEfficiency(float efficiency) { //to set mPG.
        this.efficiency += efficiency;
    }
    public String toString() {
        return ("Odometer: "+milesDriven+"\nTotal gallons: "+gallons+"\nFuel Efficiency average: ???");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mD=0, gal=0, odoClock, mPG;
        boolean repeat=true;
        while(repeat) {
            odoMeter totalMD = new odoMeter(mD, gal);
            odoMeter totalGal = new odoMeter(mD, gal);
            odoMeter fuelEfficiency = new odoMeter(mD, gal);
            //System.out.println("Odometer clock: "+odoClock);
            System.out.print("How many trips did you take last Summer? ");
            int t = sc.nextInt();
            System.out.println("So " + t + " trips. Let's calculate your fuel efficiency and your odometer.");
            for (int i = 1; i <= t; i++) {
                System.out.println("Trip #" + i + ": ");
                System.out.print("How many miles did you drive? ");
                mD = sc.nextFloat();
                System.out.print("How many gallons have you consumed? ");
                gal = sc.nextFloat();
                mPG = (mD / gal);
                odoClock = totalMD.getMilesDriven();
                System.out.println("Last odometer clock value before reset: "+odoClock); //because of the way accumulation works, I can't seem to completely zero out the odometer. But it retains the last odometer value before it gets reset. So this may be valuable data.
                totalMD.setTotalOdometer(mD);
                totalGal.setTotalGallons(gal);
                fuelEfficiency.setEfficiency(mPG);
            }

            System.out.println("Total miles: " + totalMD.getMilesDriven());
            System.out.println("Total gallons consumed: " + totalGal.getGallons());
            System.out.println("Efficiency average: " + String.format("%.2f", fuelEfficiency.getEfficiency()/t)+"mpg");

            System.out.print("Would you like to try again (True/False)? ");
            repeat = sc.nextBoolean();
            if(repeat) {
                System.out.print("Do you want to reset the Odometer clock (1/0)? ");
                int x = sc.nextInt();
                if(x==1) {
                    totalMD.setOdometerToZero();
                    odoClock = totalMD.getMilesDriven();
                    System.out.println("Odometer clock value: "+odoClock+"\n");
                }
                else {
                    odoClock = totalMD.getMilesDriven();
                    System.out.println("Odometer clock: "+odoClock+"\n");
                }
            }
        }
        System.out.println("Thanks for your cooperation. See you around.");
    }
}