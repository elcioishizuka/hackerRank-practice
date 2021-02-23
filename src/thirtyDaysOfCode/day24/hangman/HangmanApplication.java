package thirtyDaysOfCode.day24.hangman;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class HangmanApplication {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // How do we play the game
        System.out.println("Welcome to hangman! I will pick a word and you will try to guess it character by " +
                "character. If you guess wrong 6 times, then I win. If you can guess it before then, you win. " +
                "Are you ready? I hope so because I am.");
        System.out.println();
        System.out.println("I have picked mu word. Below is a picture, and below that is your current guess, " +
                "which starts off as nothing. Everytime you quess incorrectly, I add a body part to the picture. " +
                "When there is a full person, you lose.");

        // Allows for multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay){
            // Setting up the game
            System.out.println("\nAlright! Let's play!\n");
            Hangman game = new Hangman();

            do{
                // Draw the things
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
//                System.out.print(game.mysteryWord);

                // Get the guess
                System.out.println("Enter a character that you think is in the word");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();

                // Play the game
                while (game.isGuessedAlready(guess)){
                    System.out.println("Try again! You've already guessed that character.");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }

                // Play the guess
                if (game.playGuess(guess)){
                    System.out.println("Great guess! That character is in the word!");
                } else {
                    System.out.println("Unfortunately that character is not in the word");
                }


            } while (!game.gameOver());

            // Playing the game


            // Continue playing or no?
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (sc.next().toUpperCase().charAt(0));
            doYouWantToPlay = (response=='Y');


        }

    }

}
