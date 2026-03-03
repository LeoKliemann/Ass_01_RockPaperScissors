

import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String playAgain = "";

        do
        {
            System.out.println("Player A, enter R for rock, P for paper, or S for scissors.");
            playerA = in.nextLine();


            System.out.println("Player B, enter R for rock, P for paper, or S for scissors. ");
            playerB = in.nextLine();


            if(playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, Tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper beats Rock, Player B wins");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock beats Scissors, Player A wins");
                } else {
                    System.out.println("Illegal move Player B: " + playerB);
                }
            }
            else if(playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper beats Rock, Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, Tie!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors beats Paper, Player B wins!");
                } else {
                    System.out.println("Illegal move Player B: " + playerB);
                }
            }
            else if(playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock beats Scissors, Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors beats Paper, Player A wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors, Tie!");
                } else {
                    System.out.println("Illegal move Player B: " + playerB);
                }
            }
            else {
                System.out.println("Illegal move player A: " + playerA);
            }

            System.out.println("Play again? [Y/N]");
            playAgain = in.nextLine();

        }
        while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thank you for playing!");


    }
}
