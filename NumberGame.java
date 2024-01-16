import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int numberOfAttempts = 5;
        int userScore = 0;

        System.out.println("\t\t\t\t\tWelcome to the Number Guessing Game  ");

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.print("I'm thinking of a number between " + minRange + " and " + maxRange + ". Guess it!  :  ");

            while (attempts < numberOfAttempts) {
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    userScore++;
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Out of attempts. The correct number was: " + targetNumber);
            }

            System.out.println("Your current score: " + userScore);
            System.out.println("Do you want to play again? (yes/no)");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Your final score: " + userScore);
        scanner.close();
    }
}