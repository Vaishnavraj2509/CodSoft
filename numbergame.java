import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(100) + 1; // Random number between 1 and 100

        System.out.println("Guess the number between 1 and 100. You have 3 attempts.");

        // First attempt
        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();

        if (guess > n) {
            System.out.println("Try a smaller number.");
        } else if (guess < n) {
            System.out.println("Try a larger number.");
        } else {
            System.out.println("Congratulations! You guessed the correct number.");
            return;  // Exit after correct guess
        }

        System.out.println("Incorrect guess. Left with 2 attempts.");

        // Second attempt
        System.out.print("Enter your guess: ");
        int guess1 = sc.nextInt();

        if (guess1 > n) {
            System.out.println("Try a smaller number.");
        } else if (guess1 < n) {
            System.out.println("Try a larger number.");
        } else {
            System.out.println("Congratulations! You guessed the correct number.");
            return;
        }

        System.out.println("Incorrect guess. Left with 1 attempt.");

        // Third attempt
        System.out.print("Enter your guess: ");
        int guess2 = sc.nextInt();

        if (guess2 == n) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + n + ".");
        }
    }
}
