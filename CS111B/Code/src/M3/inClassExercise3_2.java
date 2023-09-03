package M3;

/*
The following programs need to be done using switch...case construct.

1.  Write a program that reads a one-line sentence as input and then displays the following response: If the sentence ends with a question mark (?) and the input contains an even number of characters, display the word Yes. If the sentence ends with a question mark and the input contains an odd number of characters, display the word No. If the sentence ends with an exclamation point (!), display the word Wow. In all other cases, display the words You always say followed by the input string enclosed in quotes. Your output should all be on one line. Be sure to note that in the last case, your output must include quotation marks around the echoed input string. In all other cases, there are no quotes in the output. Your program does not have to check the input to see that the user has entered a legitimate sentence.

2.Write a program that allows the user to convert a temperature given in degrees from either Celsius to Fahrenheit or Fahrenheit to Celsius. Use the following formulas:

Degrees_C = 5(Degrees_F− 32)/9
Degrees_F = (9(Degrees_C)/5) + 32)

Prompt the user to enter a temperature and either a C or c for Celsius or an F or f for Fahrenheit. Convert the temperature to Fahrenheit if Celsius is entered, or to Celsius if Fahrenheit is entered. Display the result in a readable format. If anything other than C, c, F, or f is entered, print an error message and stop.
*/

import java.util.Scanner;

public class inClassExercise3_2 {
    
    //1. yesNo; Medhanie version 
    public void yesNoMedhanie() {
        Scanner yn = new Scanner(System.in);
        System.out.println("\nWrite a sentence and end it with a punctuation (i.e. ?, !, etc.)");
        String s = yn.nextLine();
        int lenChar = s.length(); //length of all characters (this one counts from 1; this is not indexing).
        char lastChar = s.charAt(lenChar - 1); //locates last character (put minus 1 because computer reads in index, from 0,1,2,etc...)
        switch(lastChar)
        {
            case '?':
                if (lenChar %2 == 0) //even
                    System.out.println("Yes");
                else
                    System.out.println("No");
                break;
            case '!':
                    System.out.println("Wow");
                break;
            default:
                System.out.println("Nope, \"" + s + "\" is not a valid input.");
        }
        System.out.println("\nProgram terminated. Go to sleep.");
    }

    //1. yesNo; My version (use endsWith())
    public void yesNoMyVersion() {
        Scanner yn = new Scanner(System.in);
        System.out.println("\nWrite something and end it with a punctuation (i.e. ?, !, etc.)");
        String s = yn.nextLine();
        int lenChar = s.length();
        if (s.endsWith("?")) {
            if (lenChar %2 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else if (s.endsWith("!"))
            System.out.println("Wow");
        else
            System.out.println("This input is invalid. Do it again.");
    }

    //2a. tempConverta
    public void tempConverta() {
        Scanner temp = new Scanner(System.in);
        System.out.println("Temp. unit to convert. You can type Celcius, Fahrenheit, or C or F: ");
        String cf = temp.next().toUpperCase();
        System.out.println("What is the temperature? ");
        float t = temp.nextFloat();
        //char t = temp.next().charAt(0);
        //switch (t.charAt(0)) { 
            //with Switch case ('C'): ('F'):, it imposed a problem where you can input cwhatever or fwhatever and will still take it as celcius or fahrenheit. I get it now. charAt(0) only cares about the 0 index, anything else after it can be whatever.
        switch (cf) {
            case ("CELCIUS"):
            case ("C"):
                //System.out.println("What is the temperature we're converting from °C to °F: ");
                //float c = temp.nextFloat();
                System.out.printf("It is %.1f°F.\n", ((t*9 /5) +32));
                break;
            case ("FAHRENHEIT"):    
            case ("F"):
                //System.out.println("What is the temperature we're converting from °F to °C: ");
                //float f = temp.nextFloat();
                System.out.printf("It is %.1f°C.\n", ((t - 32) * 5/9));
                break;
            default:
                System.out.println("Wrong input buddy.");
        }
        System.out.println("\nEnd of program.");
    }

    //2b. temponvertb
    public void tempConvertb() {
        Scanner temp = new Scanner(System.in);
        float degC, degF, t;
        String cf;
        System.out.println("Temp to convert. You can type Celcius, Fahrenheit, or C or F: ");
        cf = temp.nextLine().toLowerCase();
        System.out.println("What is the temperature in " + cf + "?");
        t = temp.nextFloat();

        degC = ((5 * (t - 32))/9);
        degF = ((9 * (t/5)) + 32);

        switch (cf) { //this guy however will not take words celcius, fahrenheit, or cwhatever, fwhatever. Case only resolves to default.
            case ("celcius"):
            case ("c"):
                System.out.printf("Your temperature converted to Fahrenheit is %.1f°F.\n", degF);
            break;
            case ("fahrenheit"):
            case ("f"):
                System.out.printf("Your temperature converted to Celcius is %.1f°C.\n", degC);
            break;
            default:
                System.out.println("Error.");
        }
        System.out.println("\nEnd of program.");
    }

    

    public static void main(String[] args) {
        inClassExercise3_2 a = new inClassExercise3_2();
        //a.yesNoMedhanie();
        //a.yesNoMyVersion();
        //a.tempConverta();
        a.tempConvertb();
    }
}



// In this case here, when I use string method endsWith(), I end up using if else statements. 
//See if I can try Switch Case while using endsWith().
//Gave up for now. May be it is not possible.
