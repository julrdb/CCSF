package A5;
import java.util.Scanner;
public class temperature {
    private float tempValue; //instance variable
    private String tempUnit; //instance variable
    //4 constructors
    public temperature() { //no-argument constructor
        tempValue = 0;
        tempUnit = "C";
    }
    public temperature(float v) { //one argument (temperature value) constructor
        tempValue = v;
    }
    public temperature(String u) { //one argument (°C or °F) constructor
        tempUnit = u;
    }
    public temperature(float v, String u) { //multiple argument constructor
        tempValue = v;
        tempUnit = u;
    }
    //2 accessor/getter methods (conversion formula goes here)
    public float getTempValue() {
        return tempValue;
    }
    public String getTempUnit() {
        return tempUnit;
    }
    public float getCelsius() {
        return ((tempValue-32)*5/9);
    }
    public float getFahrenheit() {
        return ((tempValue*9/5)+32);
    }
    //3 mutator/setter methods
    public void setTempValue(float tempValue) {
        this.tempValue = tempValue;
    }
    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }
    public void setBoth(float tempValue, String tempUnit) {
        this.tempValue = tempValue;
        this.tempUnit = tempUnit;
    }
    public String toString() {
        return String.format("%.1f°"+tempUnit.toUpperCase(), tempValue);
    }

    //To compare instance variable values. This will make sure 0°C & 32°F for instance, are equal.
    public boolean equally(temperature other) {
        return (((this.getCelsius()==other.tempValue) || (this.getFahrenheit()== other.tempValue)) && ((this.tempUnit.equalsIgnoreCase("c")) || (this.tempUnit.equalsIgnoreCase("f"))));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature and its unit(C or F): ");
        float x = sc.nextFloat();
        String y = sc.next();
        System.out.println(new temperature());
        temperature t0 = new temperature();
        temperature v = new temperature(x);
        temperature t3 = new temperature(x, y);
        temperature convertT3 = new temperature(x,y);
        switch (y) {
            case "c", "C" -> convertT3.setBoth(v.getCelsius(),"f");

            case "f","F" -> convertT3.setBoth(v.getCelsius(),"c");
            default -> System.out.println("default: " + t0); //I really can't find a way to output this if the user
            // leaves the inputs blank; how does the user even leave the inputs blank? It doesn't allow it to.
        }
        System.out.println("t3: " + t3 + ", convertT3: " + convertT3);
        System.out.println("default (t0): " +t0);
        if(t3==convertT3) //Comparing references
            System.out.println("Using equality \"==\", Objects t3 and convertT3 are equal.");
        else
            System.out.println("Using equality \"==\", Objects t3 and convertT3 are NOT equal.");
        if (t3.equally(convertT3)) //Comparing instance variable values.
            System.out.println("Using boolean method \"equally\", Objects t3 and convertT3 are equal.");
        else
            System.out.println("Using boolean method \"equally\", Objects t3 and convertT3 are NOT equal.");
        if (t0.equally(convertT3))
            System.out.println("Using boolean method \"equally\", Objects t0 and convertT3 are equal.");
        else
            System.out.println("Using boolean method \"equally\", Objects t0 and convertT3 are NOT equal.");
        System.out.println("I'm tired. Goodnight.");
    }
}