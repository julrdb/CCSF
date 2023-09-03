/*
Codebase is not entirely my idea.
Most of it are derived from these two individuals on YouTube:
        CodingWithTim
        Rok Novosel
After which I have studied the mechanisms and started refactoring this project for simplicity and cleaner code.
*/

package Project;

//import java.util.Arrays;
import java.util.Scanner;


public class HangmanRefactor {
    public static int lifeCount, tries;
    public static char guess;
    public static boolean matchNStore, reveal, wordComplete;
    public static Scanner sc = new Scanner(System.in);

    // Phrases database using String array.
    public static String[] phraseList = {"happy go lucky", "the best of both worlds", "once in a blue moon", "i love you", "heaven on earth", "back to square one", "a piece of cake", "let bygones be bygones", "cut to the chase", "an arm and a leg", "a blessing in disguise", "burning bridges"};

    // Hangman status images (based on 8 lives).
    public static void hangmanStatus(int lifeCount) {
        switch(lifeCount) {
            case 8 -> System.out.print("\n"+"""
                __ ____ 
                  |        
                  |     
                  |        
                  |        
                  |        
                  |        
                __|_______ 
                Lives left: 8""");
            case 7 -> System.out.print("\n"+"""
                __ ____
                  |   |  
                  |  
                  | 
                  |     
                  |     
                  |     
                __|_______
                Lives left: 7""");
            case 6 -> System.out.print("\n"+"""
                __ ____
                  |   |  
                  |   |  
                  |      
                  |      
                  |      
                  |      
                __|_______
                Lives left: 6""");
            case 5 -> System.out.print("\n"+"""
                __ ____  
                  |   |  
                  |   |  
                  |   O  
                  |      
                  |      
                  |      
                __|_______
                Lives left: 5""");
            case 4 -> System.out.print("\n"+"""
                __ ____  
                  |   |  
                  |   |  
                  |   O  
                  |   |    
                  |      
                  |      
                __|_______
                Lives left: 4""");
            case 3 -> System.out.print("""
                __ ____  
                  |   |  
                  |   |  
                  |   O  
                  |  -|  
                  |     
                  |      
                __|_______
                Lives left: 3""");
            case 2 -> System.out.print("""
                __ ____  
                  |   |  
                  |   |  
                  |   O  
                  |  -|-  
                  |      
                  |      
                __|_______
                Lives left: 2""");
            case 1 -> System.out.print("""
                __ ____  
                  |   |  
                  |   |  
                  |   O  
                  |  -|-  
                  |  /    
                  |      
                __|_______
                Lives left: 1""");
            case 0 -> System.out.print("""
                __ ____ 
                  |   |  
                  |   |  
                  |   O  
                  |  -|- 
                  |  / \\
                  |      
                __|_______
                Gameover! :(""");
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Project Hangman!");
        boolean playing = true;
        while(playing) {
            System.out.println("..........................................................");

            // This code grabs the phrase from the Phrase in random order.
            String chosen = phraseList[(int) (Math.random() * phraseList.length)];

            // Converts the chosen phrase to an array of chars, so that we can effectively masks letters with '*' and spaces with a space.
            char[] chosenToArray = chosen.toCharArray();
            char[] playerGuess = new char[chosenToArray.length];
           
            StringBuilder cTA = new StringBuilder(String.valueOf(chosenToArray));
            StringBuilder pG = new StringBuilder(String.valueOf(playerGuess));

            // maskLoop();
            // This loop will go through each char of the chosen phrase that had been converted to char array, and determine whether it will be replaced with '*' or a space.
            for (int i = 0; i < chosenToArray.length; i++) {
                if (cTA.charAt(i) == ' ') {
                    playerGuess[i] = ' ';
                }
                else {
                    playerGuess[i] = '*';
                }
            }
            lifeCount = 8;
            wordComplete = false;
            tries = 0;
            while(!wordComplete && (tries != chosenToArray.length)) {
                System.out.print("Guess: ");
                guess = sc.next().toLowerCase().charAt(0);
                tries++;
                while(!Character.isLetterOrDigit(guess)) {
                    System.out.println("This character is not allowed; please try again.");
                    guess = sc.next().toLowerCase().charAt(0);
                }
                matchNStore = false;
                // matchNStoreLoop();
                // This loop will evaluate whether the guessed letter is on the chosen phrase (matching) and will store it on cTA Stringbuilder (storing). 
                for (int i = 0; i < chosenToArray.length; i++) {
                    if (guess == cTA.charAt(i)) {
                        playerGuess[i] = cTA.charAt(i);
                        matchNStore = true;
                    }
                }
                if(!matchNStore) {
                    lifeCount--;
                    System.out.println("Wrong guess!");
                }
                hangmanStatus(lifeCount);
                System.out.println("\nTries left: " + (chosenToArray.length - tries));
                reveal = true;

                // unmaskLoop();
                // This is where the correct guessed letters start to unveil from the asterisk. Unguessed letters remain an asterisk.
                for (int i = 0; i < chosenToArray.length; i++) {
                    if(playerGuess[i] == '*') {
                        pG.setCharAt(i,'*');
                        reveal = false;
                    }
                    else {
                        pG.setCharAt(i,playerGuess[i]);
                    }
                }
                System.out.print(pG.toString());
                System.out.println();
                
                if(reveal) {
                    System.out.println("Congratulations, you got it!\n");
                    wordComplete = true;
                    playing = false;
                }
                else if (lifeCount == 0) {
                    System.out.println("You are dead!");
                    System.out.println("The phrase was \"" + chosen + ".\"");
                    wordComplete = true;
                    playing = false;
                }
            }
            if(tries == chosenToArray.length) {
                System.out.println("You ran out of tries.");
                System.out.println("Do you want to play another game? (True/False)");
                playing = sc.nextBoolean();
            }
        }
    }
}
