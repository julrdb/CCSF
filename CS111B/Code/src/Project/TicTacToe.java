package Project; //remove this if needed. This is my IDE package structure.
/*
Co-author: Julius Rey Barro
Project Tic Tac Toe

Disclaimer:
    Not all the code is my idea. Credits to Alex Lee from Youtube for the following logic:
    -using ArrayList to store user input on to an ArrayList (playerXArray and playerOArray).
    -switch(player) in method placement()
    -winStreak() method to build List of win patterns and store them in an ArrayList (streaks), and run for each loop to check if user's ArrayList contains any of the win patterns or when the game board is full
    -while loop while(playerXArray.contains(pX) || playerOArray.contains(pX)) to check if the position is already filled prior.
    -finally, if(result.length()>0) { System.out.println(result); break; } to properly break the flow of the while loop when the player produces a winning pattern.
*/


import java.util.*; //import all packages just so I don't have to import one by one and also fewer lines of code.

public class TicTacToe {

    public static int pX, pO, pXScore, pOScore, rounds;
    public static char xo;
    public static boolean newRound, playing;
    public static Scanner sc = new Scanner(System.in);
    // This ArrayList below stores PlayerX's inputs.
    public static ArrayList<Integer> playerXArray = new ArrayList<Integer>();
    // This ArrayList below stores PlayerO's inputs.
    public static ArrayList<Integer> playerOArray = new ArrayList<Integer>();
    // This ArrayList below stores the win patterns on Tic Tac Toe.
    public static ArrayList<List> streaks = new ArrayList<List>();


    public static char[][] board = {{' ','|',' ','|',' '},
                                    {'-','+','-','+','-'},
                                    {' ','|',' ','|',' '},
                                    {'-','+','-','+','-'},
                                    {' ','|',' ','|',' '}};

    // This prints the 2D char[][] board
    public static void displayBoard(char[][] board) {
        for (char[] row : board) {
            for (char c: row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    /*
    This method has two switch for two purposes:
    -switch(player) will assign 'X' if "pX" was the assigned case. Same thing happens with "pO" case, but will assign 'O'. "reset" case I came up with because for some reason when I play again, the last filled game board gets printed instead of printing a new blank game board.
    -switch(position) will fill specified board indexes with the x/o assignment from the player cases.
    */
    public static void placement(String player, int position) {
        switch (player) {
            case "pX" -> {
                xo = 'X';
                playerXArray.add(position);
            }
            case "pO" -> {
                xo = 'O';
                playerOArray.add(position);
            }
            case "reset" -> xo = ' ';
        }
        switch(position) {
            case 1 -> board[0][0] = xo;
            case 2 -> board[0][2] = xo;
            case 3 -> board[0][4] = xo;
            case 4 -> board[2][0] = xo;
            case 5 -> board[2][2] = xo;
            case 6 -> board[2][4] = xo;
            case 7 -> board[4][0] = xo;
            case 8 -> board[4][2] = xo;
            case 9 -> board[4][4] = xo;
        }
    }

    /*
    This method creates raw Lists of win streak patterns on TicTacToe.
    -After that each List gets added to streaks ArrayList.
    -A for each loop will run to evaluate whether PlayerX or PlayerO's stored inputs on their respective ArrayLists contains any of the win streak patterns. The last else if basically will announce no player had won and the game board is completely filled.
    -return ""; at the end of the for each loop is there since the method is not a void type and so it needed a return command.
    */
    public static String winStreak() {
        //Win conditions below:
        List vertLeft = Arrays.asList(1,4,7);    //Vertical streak
        List vertMid = Arrays.asList(2,5,8);     //Vertical streak
        List vertRight = Arrays.asList(3,6,9);   //Vertical streak
        List horUp = Arrays.asList(1,2,3);       //Horizontal streak
        List horMid = Arrays.asList(4,5,6);      //Horizontal streak
        List horBottom = Arrays.asList(7,8,9);   //Horizontal streak
        List diagForward = Arrays.asList(3,5,7); //Diagonal streak
        List diagBack = Arrays.asList(1,5,9);    //Diagonal streak

        streaks.add(vertLeft);
        streaks.add(vertMid);
        streaks.add(vertRight);
        streaks.add(horUp);
        streaks.add(horMid);
        streaks.add(horBottom);
        streaks.add(diagForward);
        streaks.add(diagBack);

        for(List i: streaks) {
            if(playerXArray.containsAll(i)) {
                return("Congratulations PlayerX, you won!");
            }
            else if(playerOArray.containsAll(i)) {
                return("Congratulations PlayerO, you won!");
            }
        }
        //After testing many variations of conditionals, separating this from the first for loop above enables checking for win streak even when game board is full.
        for(List j: streaks) {
            if(playerXArray.size()+playerOArray.size()==9) {
                return("Board is full; nobody won.");
            }
        }
        return "";
    }

    //I just made this scoreboard so there can be a tracking of scores between the two players.
    public static void scoreBoard() {
        //scoreboard template:
        System.out.println("PlayerX \tPlayerO ");
        System.out.println(pXScore+"\t\t\t"+pOScore);
    }


    public static void main(String[] args) {
        System.out.println("\nWelcome to Tic Tac Toe!");
        rounds=0;
        pXScore=0;
        pOScore=0;
        newRound=true;
        //Inside this while loop below I decided to set 5 rounds of play which will exit the game when it reaches 5.
        while(newRound && rounds!=5) {
            rounds++;
            System.out.println("------Round "+rounds+"------");
            scoreBoard();
            displayBoard(board);
            playing=true;
            while(playing) {
                //PlayerX enters placement
                System.out.println("PlayerX enter your placement (1-9): ");
                pX = sc.nextInt();
//                while(!sc.hasNext("[1-9]")) {
//                    System.out.println("Wrong input, 1-9, only please: ");
//                    pX = sc.nextInt();
//                }
                while(playerXArray.contains(pX)||playerOArray.contains(pX)) {
                    System.out.println("Already filled; try again: ");
                    pX = sc.nextInt();
                }
                placement("pX", pX);
                displayBoard(board);
                //Check who won
                System.out.println("winStreak length: "+winStreak().length());
                //winStreak length of 26 is game board full, no winner.
                if(winStreak().length()==26) {
                    System.out.println(winStreak());
                    break; //These break statements are essential to get out of the while loop without having to continue down the code when it should just stop.
                }
                //Just noticed winStreak length of 33 is always a win regardless if the game board got full or not, both for  X and O.
                else if(winStreak().length()==33) {
                    System.out.println(winStreak());
                    pXScore++;
                    break;
                }
                //PlayerO enters placement
                System.out.println("PlayerO enter your placement (1-9): ");
                pO = sc.nextInt();
//                while(!sc.hasNext("[1-9]")) {
//                    System.out.println("Wrong input, 1-9, only please: ");
//                    pO = sc.nextInt();
//                }
                while(playerXArray.contains(pO)||playerOArray.contains(pO)) {
                    System.out.println("Already filled; try again: ");
                    pO = sc.nextInt();
                }
                placement("pO", pO);
                displayBoard(board);

                //Check who won
                System.out.println("winStreak length: "+winStreak().length());
                if(winStreak().length()==26) {
                    System.out.println(winStreak());
                    break;
                }
                else if(winStreak().length()==33) {
                    System.out.println(winStreak());
                    pOScore++;
                    break;
                }
            }
            System.out.println("\nPlay again (true/false)?");
            //While the player decides whether to play again, I initiated clear() commands for playerXArray, playerOArray, and streaks ArrayList. Underneath them is a for loop to run placement method so on the next game it prints a blank game board.
            playerXArray.clear();
            playerOArray.clear();
            streaks.clear();
            for(int i=1;i<=9;i++) {
                placement("reset",i);
            }
            newRound=sc.nextBoolean();
        }
        //At the end if the player decides to stop playing, the final scores between playerX and playerO is displayed.
        System.out.println("------ Final scores: ------");
        scoreBoard();
    }
}
