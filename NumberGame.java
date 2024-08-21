import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number (between 1 and 100):");

            while (!hasGuessedCorrectly && attempts < 10) {
                System.out.print("Enter your guess: "); 
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("You've used all your attempts. The number was: " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}