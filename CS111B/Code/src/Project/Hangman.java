package Project;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    //instance variables
    private static int lifeCount;
    public static char guess;
    public static boolean matchNStore, reveal;
    public static Scanner sc = new Scanner(System.in);

    //Hangman status images (based on 8 lives).
    public static void hangmanStatus(int lifeCount) {
        switch(lifeCount) {
            case 8 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 8");
            }
            case 7 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 7");
            }
            case 6 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |   |   \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 6");
            }
            case 5 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |   |   \n" +
                                   "  |   O   \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 5");
            }
            case 4 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |   |   \n" +
                                   "  |   O   \n" +
                                   "  |   |   \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 4");
            }
            case 3 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |   |   \n" +
                                   "  |   O   \n" +
                                   "  |  -|   \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 3");
            }
            case 2 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |   |   \n" +
                                   "  |   O   \n" +
                                   "  |  -|-  \n" +
                                   "  |       \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 2");
            }
            case 1 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |   |   \n" +
                                   "  |   O   \n" +
                                   "  |  -|-  \n" +
                                   "  |  /    \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Lives left: 1");

            }
            case 0 -> {
                System.out.println();
                System.out.println("__ ____   \n" +
                                   "  |   |   \n" +
                                   "  |   |   \n" +
                                   "  |   O   \n" +
                                   "  |  -|-  \n" +
                                   "  |  / \\ \n" +
                                   "  |       \n" +
                                   "__|_______\n" +
                                   "Gameover! :(");
            }
        }
    }
    //    Letter guess checker
    //    Word guess checker
    //    Need a hidden text to display

    //Phrases database
    public static String[] phrase = {
        "the best of both worlds", "once in a blue moon", "i love you", "heaven on earth", "back to square one", "a piece of cake" ,"let bygones be bygones", "cut to the chase", "an arm and a leg", "a blessing in disguise", "burning bridges" };

    //This grabs the phrase
    public static String chosen = phrase[(int)(Math.random()*phrase.length)];

    //Converts the phrase to an array.
    public static char[] chosenToArray = chosen.toCharArray();

    //Create a method that will mask the word with "*"

    //This fills the chArray with blanks for spaces, '*' for letters.
    public static char[] playerGuess = new char[chosenToArray.length];

    public static void main(String[] args) {
        lifeCount=8;
        System.out.println("Welcome to Project Hangman!!!");
        for(int i=0; i<chosenToArray.length; i++ ) {
            if(chosenToArray[i] == ' ')
                playerGuess[i] = ' ';
            else
                playerGuess[i] = '*';
        }
        //Set a boolean and while loop to set the game's flow
        boolean playing = true;
        int tries = 0;
        while(playing) {
            System.out.println("..........................................................");
            //System.out.println("chosenToArray = " + Arrays.toString(chosenToArray));
            //System.out.println("playerGuess   = " + Arrays.toString(playerGuess));
            System.out.print("Guess: ");
            //System.out.println(h.hideWord());
            guess = sc.next().toLowerCase().charAt(0);
            tries++;
            while(!Character.isLetterOrDigit(guess)) {
                System.out.println("This character is not allowed; please try again.");
                guess = sc.next().toLowerCase().charAt(0);
            }
            matchNStore = false;
            for(int i=0; i<chosenToArray.length; i++) {
                if(guess==chosenToArray[i]) {
                    playerGuess[i] = chosenToArray[i];
                    matchNStore = true;
                }
            }
            if(!matchNStore) {
                lifeCount--;
                System.out.println("Wrong guess!");
            }
            hangmanStatus(lifeCount);
            System.out.println("Tries left: "+(chosenToArray.length-tries));

            reveal = true;
            for(int i=0; i<chosenToArray.length; i++) {
                if(playerGuess[i]=='*') {
                    System.out.print("*");
                    reveal = false;
                }
                else
                    System.out.print(playerGuess[i]);
            }

            if(reveal) {
                System.out.println("Congratulations, you got it!");
                playing = false;
            }
            else if(lifeCount==0) {
                System.out.println("You are dead!");
                System.out.println("The phrase was: \n\"" + chosen + "\"");
                playing = false;
            }
            else if(tries == chosen.length()) {
                System.out.println("You ran out of tries.");
                //System.out.println("Do you want to play another game? (True/False)");
                //playing = sc.nextBoolean();
                playing = false;
            }
        }
        System.out.println("\""+chosen+"\"");
    }
}


