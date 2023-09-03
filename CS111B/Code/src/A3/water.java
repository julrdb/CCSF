package A3;

/*
2.) Write a program water.java that asks for temperature in Fahrenheit. The program should accept any floating point number. Display whether water is liquid, solid, or gas at that temperature at sea level. Display the results like this: “Water at that temperature is a solid/liquid/gas.” (Note: display only the correct state for that temperature.)
Facts: At sea level, water freezes at 32 degrees F and boils at 212 degrees F. (4 points)

Extra credit: 1 point if you convert the temperatures to celsius when printing.
*/

import java.util.Scanner;

public class water {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("\nProvide me the water temperature in Fahrenheit and I'll tell you it's state.");
        float tempState = t.nextFloat();
        if (tempState < 32)
            System.out.println("Water at that temperature (which is " + (String.format("%.1f",((tempState - 32) * 5/9))) + " °C) is solid.\n");
        else if ((tempState >= 32) && (tempState <= 212))
            System.out.println("Water at that temperature (which is " + (String.format("%.1f",((tempState - 32) * 5/9))) + " °C) is liquid.\n");
        else //if (tempState > 212)
            System.out.println("Water at that temperature (which is " + (String.format("%.1f",((tempState - 32) * 5/9))) + " °C) is gas.\n");

    }
}
//(tempState − 32) × 5/9) + °C)
//done!