import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 3 rounds to play.");
        
        for (int round = 1; round <= 3; round++) {
            int targetNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attemptsLeft = 5;
            int score = 0;
            
            System.out.println("\nRound " + round);
            System.out.println("Try to guess the number between 1 and 100. You have 5 attempts.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                
                if (guess < targetNumber) {
                    System.out.println("Too Low");
                } else if (guess > targetNumber) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    score = attemptsLeft * 10;
                    break;
                }
                
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("Sorry, you're out of attempts. The number was: " + targetNumber);
                }
            }
            
            System.out.println("Your score for Round " + round + ": " + score);
            totalScore += score;
        }
        
        System.out.println("\nTotal score for all rounds: " + totalScore);
        System.out.println("Thank you for playing!:-)");
    }
}
